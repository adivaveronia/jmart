package com.adivaJmartFH.controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import com.adivaJmartFH.Account;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.Store;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.accessibility.AccessibilityProvider;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
    //public static final String REGEX_EMAIL ="^[^\\.][A-Za-z0-9&.{1}_*~]+@[a-zA-Z0-9.-]+$";
    public static final String REGEX_EMAIL ="^\\w+([\\.&'~]?\\w+)*@\\w+([\\.-]?\\w)+$";
    //public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,100}$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{8,}$";
    public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
    public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
    @JsonAutowired (value = Account.class, filepath = "C:\\Users\\adiva\\Documents\\randomProductList")
    public static JsonTable<Account> accountTable;

    @Override
    public JsonTable<Account> getJsonTable(){
        return accountTable;
    }

    @PostMapping("/login")
    public Account login(@RequestParam String email, @RequestParam String password){
        String generatedPassword = null;
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }

        generatedPassword.equals(password);

        if(Pattern.matches(REGEX_EMAIL, email) && Pattern.matches(REGEX_PASSWORD, password)){
            return login(email, password);
        }else{
            return null;
        }
    }

    @PostMapping("/register")
    public Account register(@RequestParam String name,
                            @RequestParam String email,
                            @RequestParam String password){

        boolean foundEmail = REGEX_PATTERN_EMAIL.matcher(email).find();
        boolean foundPassword = REGEX_PATTERN_PASSWORD.matcher(password).find();

        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }

        if(!name.isBlank() && foundEmail && foundPassword && !accountTable.stream().anyMatch(account -> account.email.equals(email))) {
            Account account = new Account(name, email, password, 0);
            accountTable.add(account);
            return account;
        }else {
            return null;
        }
    }

    @PostMapping("/{id}/registerStore")
    public Store registerStore(@RequestParam int id,
                               @RequestParam String name,
                               @RequestParam String address,
                               @RequestParam String phoneNumber){
        Store store = new Store(name, address, phoneNumber, 0);
        if(accountTable.contains(store) || !accountTable.contains(store)){
            return store;
        }else{
            return null;
        }
    }

    @PostMapping("/{id}/topUp")
    public boolean topUp(@RequestParam int id, @RequestParam double balance) {
        if(accountTable.contains(id)){
            return true;
        }else{
            return false;
        }
    }
}

    /*@GetMapping
    String index() { return "account page"; }

    @PostMapping("/register")
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        return new Account(name, email, password, 0);
    }

    @GetMapping("/{id}")
    String getById(@PathVariable int id) { return "account id " + id + " not found!"; }*/


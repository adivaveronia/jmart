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

/**
 * Untuk mengontrol apakah sudah terdapat Account atau belum dan mengecek
 * hal lain yang berhubungan
 * @author adiva
 */
@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
    //public static final String REGEX_EMAIL ="^[^\\.][A-Za-z0-9&.{1}_*~]+@[a-zA-Z0-9.-]+$";
    public static final String REGEX_EMAIL ="^\\w+([.&'~]?\\w+)*@\\w+([.-]?\\w)+$";
    //public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,100}$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{8,}$";
    public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
    public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
    @JsonAutowired (value = Account.class, filepath = "Account.json")
    public static JsonTable<Account> accountTable;

    /**
     * Menambah file untuk Account.json
     * @return instance variabel AccountTable
     */
    @Override
    public JsonTable<Account> getJsonTable(){
        return accountTable;
    }

    /**
     * Untuk login menuju aplikasi
     * Melakukan Hash terhadap password dengan algoritma MD5 kemudian
     * mengecek kebenaran password dengan perbandingan nilai hash
     * @param email dari Account yang sudah ada
     * @param password dari Account yang sudah ada
     * @return Account jika ditemukan email dan pass yang sesuai
     */
    @PostMapping("/login")
    public Account login(@RequestParam String email, @RequestParam String password){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100,16).substring(1));
            }
            password = sb.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        for (Account each : accountTable){
            if(each.email.equals(email) && each.password.equals(password)){
                return each;
            }
        }
        return null;
    }

    /**
     * Membuat objek Account baru dan menyimpan dalam accountTable yang
     * diakses dengan URI dibawah dan Request Method POST
     * @param name Nama yang akan dimasukkan/register ke Account
     * @param email Email yang akan dimasukkan/register ke Account
     * @param password Password yang akan dimasukkan/register ke Account
     * @return Account yang baru dibuat
     */
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

        //new Account(name, email, generatedPassword, 0);
        if(!name.isBlank() && foundEmail && foundPassword && !accountTable.stream().anyMatch(account -> account.email.equals(email))) {
            Account account = new Account(name, email, generatedPassword, 0);
            accountTable.add(account);
            return account;
        }else {
            return null;
        }
    }

    /**
     * Melakukan registrasi Store dengan URI di bawah dan Request Method
     * POST
     * @param id akan di cek apakah tersedia di Account
     * @param name akan di cek apakah tersedia di Account
     * @param address akan di cek apakah tersedia di Account
     * @param phoneNumber akan di cek apakah tersedia di Account
     * @return store jika Account sudah / belum memiliki store
     */
    @PostMapping("/{id}/registerStore")
    public Store registerStore(@RequestParam int id,
                               @RequestParam String name,
                               @RequestParam String address,
                               @RequestParam String phoneNumber){
        Store store = new Store(name, address, phoneNumber);
        if(accountTable.contains(store) || !accountTable.contains(store)){
            return store;
        }else{
            return null;
        }
    }

    /**
     * Menambahkan balance pada Account dengan id yang diberikan
     * pada parameter URI
     * @param id untuk menambahkan id jika sesuai
     * @param balance nilai yang akan ditambahkan ke Account
     * @return true jika akun ditemukan, false jika sebaliknya
     */
    @PostMapping("/{id}/topUp")
    public boolean topUp(@RequestParam int id, @RequestParam double balance) {
        if(accountTable.contains(id)){
            return true;
        }else{
            return false;
        }
    }
}



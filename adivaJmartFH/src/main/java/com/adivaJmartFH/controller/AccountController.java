package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.JsonTable;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
    public static final String REGEX_EMAIL ="^[^\\.][A-Za-z0-9&.{1}_*~]+@[a-zA-Z0-9.-]+$";
    public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,100}$";
    public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
    public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
    public static @JsonAutowired
   (value = Account.class, filepath = "C:\\Users\\adiva\\Documents\\randomProductList") JsonTable<Account> accountTable;

    public JsonTable<Account> getJsonTable(){
        return accountTable;
    }

    @PostMapping("/login")
    public @ResponseBody ResponseEntity <Account> login(String email, String password){
        if(Pattern.matches(REGEX_EMAIL, email) && Pattern.matches(REGEX_PASSWORD, password)){
            return new ResponseEntity(true, HttpStatus.OK);
        }else{
            return new ResponseEntity(null, HttpStatus.OK);
        }
    }

    //@PostMapping("/register")




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
}

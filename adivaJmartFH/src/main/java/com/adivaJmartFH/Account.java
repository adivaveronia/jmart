package com.adivaJmartFH;
import java.util.regex.Pattern;
import com.adivaJmartFH.dbjson.Serializable;

/**
 * Mengatur data pada Account
 * @author Adiva Veronia
 */
public class Account extends Serializable
{
    public static final String REGEX_EMAIL ="^\\w+([.&'~]?\\w+)*@\\w+([.-]?\\w)+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{8,}$";
    public double balance;
    public String name;
    public String email;
    public String password;
    public Store store;

    /**
     * Menginstansiakan variabel instance sesuai dengan parameter
     * @param name nama dari Account
     * @param email email dari Account
     * @param password pass dari Account
     * @param balance balance dari Account
     */
    public Account(String name, String email, String password, double balance){
        this.name = name;
        this.email = email;
        this.password =  password;
        this.balance = balance;
    }

    /**
     * Memvalidasi email dan password
     * @return true jika email dan password sesuai regex
     */
    public boolean validate(){
        boolean found =  Pattern.matches(REGEX_EMAIL, email) && Pattern.matches(REGEX_PASSWORD, password);
        return found ? true : false;
    }
    
}

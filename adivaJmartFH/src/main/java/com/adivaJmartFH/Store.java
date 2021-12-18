package com.adivaJmartFH;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Adiva Veronia
 */
public class Store
{
    public static final String REGEX_PHONE ="[0-9]{9,12}";
    public static final String REGEX_NAME = "^[A-Za-z]{1,8}$";
    public String address;
    public double balance;
    public String name;
    public String phoneNumber;
    
    public Store(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "name:" + name + "\n" + "address:" + address + "\n" + "phoneNumber: " + phoneNumber;
        
    }

    /**
     * Memvalidasi nama dan nomor telepon berdasarkan ketentuan regex
     * @return true jika pattern nomor telepon dan nama sesuai regex
     */
    public boolean validate(){
        boolean found =  Pattern.matches(REGEX_PHONE, phoneNumber) && Pattern.matches(REGEX_NAME, name);
        return found ? true : false;
    }
}

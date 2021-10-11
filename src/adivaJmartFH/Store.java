package adivaJmartFH;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Store
{
    public static final String REGEX_PHONE ="[0-9]{9,12}";
    public static final String REGEX_NAME = "^[A-Za-z]{1,8}$";
    public String address;
    public double balance;
    public String name;
    public String phoneNumber;
    
    public Store(String name, String address, String phoneNumber, double balance){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    public String toString() {
        return "name: PT Madju Merdeka\naddress: Jl. Kukusan\nphoneNumber: 628777xxxx";
        
    }
    public boolean validate(){
        boolean found =  Pattern.matches(REGEX_PHONE, name) && Pattern.matches(REGEX_NAME, phoneNumber);
        return found ? true : false;
    }
}

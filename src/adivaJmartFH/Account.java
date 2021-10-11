package adivaJmartFH;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account extends Recognizable
{
    public static final String REGEX_EMAIL ="^[^\\.][A-Za-z0-9&.{1}_*~]+@[a-zA-Z0-9.-]+$";
    public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,100}$";
    public double balance;
    public String name;
    public String email;
    public String password;
    public Store store;
    
    public Account(String name, String email, String password, double balance){
        this.name = name;
        this.email = email;
        this.password =  password;
        this.balance = balance;
    }

    public boolean validate(){
        boolean found =  Pattern.matches(REGEX_EMAIL, email) && Pattern.matches(REGEX_PASSWORD, password);
        return found ? true : false;
    }
    
}

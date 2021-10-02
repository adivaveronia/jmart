package adivaJmartFH;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Store extends Recognizable implements FileParser
{
    public static final String REGEX_PHONE ="[0-9]{9,12}";
    public static final String REGEX_NAME = "^[A-Z][A-Za-z]{4,20}";
    public String name;
    public String address;
    public String phoneNumber;
    
    public Store(int accountId, String name, String address, String phoneNumber){
        super(accountId);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Store(Account account, String name, String address, String phoneNumber){
        super(account.id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public Object write(){
        return null;
    }
    @Override
    public boolean read(String content){
        return false;
    }
    public String toString() {
        return "name: PT Madju Merdeka\naddress: Jl. Kukusan\nphoneNumber: 628777xxxx";
        
    }
    public boolean validate(){
        boolean found =  Pattern.matches(REGEX_PHONE, name) && Pattern.matches(REGEX_NAME, phoneNumber);
        return found ? true : false;
    }
}

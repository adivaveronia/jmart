package adivaJmartFH;

public class Account extends Recognizable implements FileParser
{
    public String name;
    public String email;
    public String password;
    
    public Account(int id, String name, String email, String password){
        super(id);
        this.name = name;
        this.email = email;
        this.password =  password;
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
        return "name: Ramadhan\nemail: ramadhanganteng@gmail.com\npassword: gu3G4ntEnG";
    }
    
}

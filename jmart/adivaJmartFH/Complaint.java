package adivaJmartFH;


public class Complaint extends Recognizable implements FileParser
{
    public String date;
    public String desc = "text";
    
    public Complaint(int id, String desc){
        super(id);
        this.desc = desc;
    }
    
    @Override
    public Object write(){
        return null;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }

}

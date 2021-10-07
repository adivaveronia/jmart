package adivaJmartFH;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Complaint extends Recognizable implements FileParser
{
    public Date date;
    public String desc;
    
    public Complaint(int id, String desc){
        super(id);
        this.desc = desc;
        this.date = new java.util.Date();
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
        SimpleDateFormat complaintDate = new SimpleDateFormat("dd/MM/yyyy");
        String complaintDateText = complaintDate.format(date);
        return "Complaint{date=" + complaintDate +", desc='" + desc + "'}";
    }

}

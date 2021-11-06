package adivaJmartFH;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Complaint extends Serializable {
    public Date date;
    public String desc;
    
    public Complaint(String desc){
        this.desc = desc;
        this.date = new java.util.Date();
    }

    public String toString() {
        SimpleDateFormat complaintDate = new SimpleDateFormat("dd/MM/yyyy");
        String complaintDateText = complaintDate.format(date);
        return "Complaint{date=" + complaintDate +", desc='" + desc + "'}";
    }

}

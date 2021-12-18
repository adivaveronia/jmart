package com.adivaJmartFH;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.adivaJmartFH.dbjson.Serializable;

/**
 * @author Adiva Veronia
 */
public class Complaint extends Serializable {
    public Date date;
    public String desc;

    /**
     * Constructor yang meng-instansiasikan deskripsi komplain dan
     * tanggal komplain
     * @param desc deskripsi dari komplain
     */
    public Complaint(String desc){
        this.desc = desc;
        this.date = new java.util.Date();
    }

    /**
     * @return tanggal complain dan deskripsinya
     */
    public String toString() {
        SimpleDateFormat complaintDate = new SimpleDateFormat("dd/MM/yyyy");
        String complaintDateText = complaintDate.format(date);
        return "Complaint{date=" + complaintDate +", desc='" + desc + "'}";
    }

}

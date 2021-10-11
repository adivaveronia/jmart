package adivaJmartFH;

import java.util.Date;
import java.util.ArrayList;

/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Invoice extends Recognizable
{
    public static enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED
    }
    
    public static enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD
    }
    
    public Date date;
    public int buyerId;
    public int productId;
    ArrayList<Record> history = new ArrayList<Record>();
    public Rating rating = Rating.NONE;
    public Status status = Status.WAITING_CONFIRMATION;
    
    protected Invoice(int id, int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = new java.util.Date();
    }
    
    public abstract double getTotalPay();
    
    public class Record {
        public Status status;
        public Date date;
        public String message;

    }
}

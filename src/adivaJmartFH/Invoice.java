package adivaJmartFH;

import java.util.Date;
import java.util.ArrayList;

/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Invoice extends Serializable
{
    public static enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED,
        DELIVERED
    }
    
    public static enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD
    }

    public int buyerId;
    public int complaintId = -1;
    public Date date;
    public int productId;
    public Rating rating = Rating.NONE;
    //public Status status = Status.WAITING_CONFIRMATION;
    
    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = new java.util.Date();
    }
    
    public abstract double getTotalPay(Product product);

}

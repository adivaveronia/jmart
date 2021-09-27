package adivaJmartFH;


/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Invoice extends Recognizable implements FileParser
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
    
    public String date = "text";
    public int buyerId;
    public int productId;
    public Rating rating = Rating.NONE;
    public Status status = Status.WAITING_CONFIRMATION;
    
    protected Invoice(int id, int buyerId, int productId){
        super(id);
        this.buyerId = buyerId;
        this.productId = productId;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
    public abstract double getTotalPay();
}

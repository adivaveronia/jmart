package adivaJmartFH;


/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment extends Invoice
{
    public int productCount;
    public Shipment shipment;
    
    Payment(int id, int buyerId, int productId, int productCount, Shipment shipment){
        super(id, buyerId, productId);
        this.productCount = productCount;
        this.shipment = shipment;
    }
    
    public boolean validate(){
        return false;
    }
    
    public Invoice perform(){
        return null;
    }
    
    public double getTotalPay(){
        return 0;
    }
    
    public Object write(){
        return null;
    }
}
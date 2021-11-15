package adivaJmartFH;

import java.util.Date;
import java.util.ArrayList;
/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment extends Invoice
{
    public ArrayList<Record> history = new ArrayList<Record>();
    public int productCount;
    public Shipment shipment;
    
    Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId);
        this.productCount = productCount;
        this.shipment = shipment;
    }
    
    /*public boolean validate(){
        return false;
    }*/
    
    /*public Invoice perform(){
        return null;
    }*/
    
    public double getTotalPay(Product product){
        return 0;
    }
    
    /*public Object write(){
        return null;
    }*/

    public class Record {
        public Status status;
        public Date date;
        public String message;

        public Record (Status status, String message){
            this.date = new java.util.Date();
        }
    }
}
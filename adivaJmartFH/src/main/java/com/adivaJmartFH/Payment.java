package com.adivaJmartFH;

import java.util.Date;
import java.util.ArrayList;
/**
 * @author (Adiva Veronia)
 */
public class Payment extends Invoice
{
    public ArrayList<Record> history = new ArrayList<>();
    public int productCount;
    public Shipment shipment;
    
    Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId);
        this.productCount = productCount;
        this.shipment = shipment;
    }
    
    public double getTotalPay(Product product){

        return (product.price-((product.discount/100)*product.price)*productCount) + shipment.cost;
    }

    /**
     * Hasil
     */
    public static class Record {
        public Status status;
        public Date date = new java.util.Date();
        public String message;

        public Record (Status status, String message){
            this.status = status;
            this.message = message;
            this.date = new java.util.Date();
        }
    }
}
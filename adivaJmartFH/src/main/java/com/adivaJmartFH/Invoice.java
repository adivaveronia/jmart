package com.adivaJmartFH;

import java.util.Date;
import java.util.ArrayList;
import com.adivaJmartFH.dbjson.Serializable;

/**
 * @author Adiva Veronia
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
    public Status status = Status.WAITING_CONFIRMATION;

    /**
     * Meng-instansiasi variabel instance sesuai parameter dan java.util.date
     * @param buyerId id dari pembeli
     * @param productId id dari produk
     */
    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = new java.util.Date();
    }
    
    public abstract double getTotalPay(Product product);

}

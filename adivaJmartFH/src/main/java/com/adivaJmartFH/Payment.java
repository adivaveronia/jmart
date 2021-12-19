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

    /**
     * Inisiasi variabel instance productCount dan shipment
     * @param buyerId id dari pembeli
     * @param productId id dari produk
     * @param productCount jumlah produk
     */
    Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId);
        this.productCount = productCount;
        this.shipment = shipment;
    }

    /**
     * @param product objek produk
     * @return total harga produk
     */
    public double getTotalPay(Product product){

        return (product.price-((product.discount/100)*product.price)*productCount) + shipment.cost;
    }

    /**
     * Memperlihatkan record dari produk
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
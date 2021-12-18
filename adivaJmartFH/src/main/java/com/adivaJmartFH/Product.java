package com.adivaJmartFH;

import com.adivaJmartFH.dbjson.Serializable;
/**
 * @author Adiva Veronia
 */
public class Product extends Serializable {
    public int accountId;
    public ProductCategory category;
    public boolean conditionUsed;
    public double discount;
    public String name;
    public double price;
    public byte shipmentPlans;
    public int weight;

    /**
     * Konstruktor menginstansiasi variabel sesuai parameter
     */
    public Product(int accountId, String name, int weight, boolean conditionUsed, double price, double discount, ProductCategory category, byte shipmentPlans) {
        this.accountId = accountId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.price = price;
        this.discount = discount;
        this.category = category;
        this.shipmentPlans = shipmentPlans;
    }

    /**
     * @return menampilkan nama, berat, dan kondisi produk
     */
    public String toString() {
        return "Account Id:" + accountId + "\n" + "Name:" + name + "\n" + "Weight:" + weight + "\n" + "conditionedUsed:" + conditionUsed + "\n" + "priceTag: " + price + "\n" + "discount: " + discount + "\n" + "category: " + category + "\n" + "shipment plans" + shipmentPlans;
    }
}

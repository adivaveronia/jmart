package com.adivaJmartFH;

public class PhoneTopUp extends Invoice{
    public String phoneNumber;
    public Status status;

    public PhoneTopUp(int buyerId, int productId, String phoneNumber){
        super(buyerId, productId);
        this.phoneNumber = phoneNumber;
    }

    public double getTotalPay(Product product) {
        return 0;
    }
}

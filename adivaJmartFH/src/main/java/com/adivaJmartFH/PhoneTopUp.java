package com.adivaJmartFH;

/**
 * @author Adiva Veronia
 */
public class PhoneTopUp extends Invoice{
    public String phoneNumber;
    public Status status;

    /**
     * Menginstansiasi variabel instance sesuai parameter
     * @param buyerId id pembeli
     * @param productId id produk
     * @param phoneNumber nomor telepon
     */
    public PhoneTopUp(int buyerId, int productId, String phoneNumber){
        super(buyerId, productId);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Total biaya dari produk
     */
    @Override
    public double getTotalPay(Product product) {

        return getTotalPay(product);
    }
}

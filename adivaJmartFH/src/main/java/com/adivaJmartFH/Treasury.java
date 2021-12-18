package com.adivaJmartFH;

/**
 * @author (Adiva Veronia)
 */
public class Treasury
{
    public static final double COMISSION_MULTIPLIER = 0.05;
    public static final double BOTTOM_PRICE = 20000.0;
    public static final double BOTTOM_FEE = 1000.0;

    public double getAdjustedPrice(double price, double discount) {
        return getDiscountPrice(price, discount) + getAdminFee(price, discount);
    }
    
    public double getAdminFee(double price, double discount) {
        if (getDiscountPrice(price, discount) != BOTTOM_PRICE) {
            return BOTTOM_FEE;
        }
        else {
            return getDiscountPrice(price, discount) * Treasury.COMISSION_MULTIPLIER;
        }
    }
    
    private double getDiscountPrice (double price, double discount) {
        if (discount >= 100.0) {
            return price = 0.0;
        }
        else {
            return price - ((discount * price)/100);
        }
    }
        
}
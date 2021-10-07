package adivaJmartFH;


/**
 * Write a description of class Pricetag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PriceTag
{
    public static final double COMISSION_MULTIPLIER = 0.05;
    public static final double BOTTOM_PRICE = 20000.0;
    public static final double BOTTOM_FEE = 1000.0;
    public double discount;
    public double price;

    public PriceTag(double price) {
        this.price = price;
        this.price = 0.0;
    }
    
    public PriceTag(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }
    
    public double getAdjustedPrice() {
        return getDiscountPrice() + getAdminFee();
    }
    
    public double getAdminFee() {
        if (getDiscountPrice() != BOTTOM_PRICE) {
            return BOTTOM_FEE;
        }
        else {
            return getDiscountPrice() * PriceTag.COMISSION_MULTIPLIER;
        }
    }
    
    private double getDiscountPrice () {
        if (discount >= 100.0) {
            return price = 0.0;
        }
        else {
            return price - ((discount * price)/100);
        }
    }
        
}
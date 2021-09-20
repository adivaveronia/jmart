package adivaJmartFH;


/**
 * Write a description of class Coupon here.
 *
 * @author (Adiva veronia)
 * @version (20/09/2021)
 */
public class Coupon
{
    // instance variables - replace the example below with your own
    public String name;
    public int code;
    public double cut;
    public Type type;
    public double minimum;
    public boolean used;
    
    /**
     * Constructor for objects of class Coupon
     */
    public Coupon(int code, Type type, double cut, double minimum, String name) {
        name = name;
        code = code;
        cut = cut;
        type = type;
        minimum = minimum;
        used = false; 
    }

    public boolean isUsed() {
        return used; 
    }
    
    // itu nama kelas PriceTag nya otomatis ke ubah jadi Pricetag gak tau kenapa
    public boolean canApply(Pricetag priceTag) {
        
        if (priceTag.getAdjustedPrice() >= minimum && used == false) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /*public double apply(Pricetag priceTag) {
        used = true;
        priceTag = (double)(priceTag.getAdjustedPrice() - cut);
        return priceTag;
    }*/
}

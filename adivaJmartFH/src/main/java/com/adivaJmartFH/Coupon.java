package com.adivaJmartFH;

import com.adivaJmartFH.dbjson.Serializable;
/**
 * @author (Adiva veronia)
 * @version (20/09/2021)
 */
public class Coupon extends Serializable {
    public static enum Type {
        DISCOUNT,
        REBATE
    }
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
        this.name = name;
        this.code = code;
        this.cut = cut;
        this.type = type; 
        this.minimum = minimum; 
        this.used = false; 
    }

    public boolean isUsed() {
        return used; 
    }

    public boolean canApply(Treasury priceTag) {
        
        if (priceTag.getAdjustedPrice(minimum, cut) >= minimum && !used) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public double apply(Treasury priceTag) {
        used = true;
        return (double)priceTag.getAdjustedPrice(minimum, cut) - cut;
        
    }
}

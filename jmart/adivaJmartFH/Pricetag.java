package adivaJmartFH;


/**
 * Write a description of class Pricetag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pricetag
{
    public double COMISSION_MULTIPLIER = 0.05;
    public double BOTTOM_PRICE = 20000.0;
    public double BOTTOM_FEE = 1000.0;
    public double discount;
    public double price;

    public void PriceTag(double price) {
        price = price;
        price = 0.0;
    }
    
    public Pricetag(double price, double discount) {
        price = price;
        discount = discount;
    }
    
    public double getAdjustedPrice() {
        return getDiscountPrice();
    }
    
    public double getAdminFee() {
        /*if (discount != BOTTOM_PRICE) {
            BOTTOM_FEE;
        }*/
        return BOTTOM_FEE;
    }
    
    private double getDiscountPrice () {
        if (discount > 100.0) {
            discount = 100.0;
        }
        else if (discount == 100.0) {
            discount = 0.0;
        }
        return discount;
        //return field;
    }
        
}

package adivaJmartFH;

public class Jmart
{
    /* dari cs modul 1
    public int getPromo() {
        return 0;
    }
    
    public String getCustomer() {
        return "oop";
    }
    
    public static float getDiscountPercentage(int before, int after) {
       
        return before > after ? ((float)(before - after) / before) * 100 : 0.0f;
    
    }
    
    public static int getDiscountedPrice(int price, float discountPercentage) {
        
        int cutPrice = 0;
        if(discountPercentage >= 100.0f){
            cutPrice = 0;
        }
        else {
            cutPrice = price - (int)((discountPercentage * price)/100);
        }   
        
        return cutPrice;
    }
    
    public static int getOriginalPrice(int discountedPrice, float discountPercentage) {
        // discounted price bisa dari fungsi getDiscountedPrice atau input before
        return (int)((100 * discountedPrice)/(float)(100 - discountPercentage));
    }
    
    public static float getComissionMultiplier() {
        return 0.05f;
    }
    
    public static int getAdjustedPrice(int price) {
        return price + (int)(price * getComissionMultiplier());
    }
    
    public static int getAdminFee(int price) {
        return (int)(price * getComissionMultiplier());
    }*/

    // dari cs modul 2
    /*public Product create() {
        Product object = new Product();
    }*/
    public static Product createProduct() {
        return null;
    }
    public static Coupon createCoupon() {
        return null;
    }
    public static ShipmentDuration createShipmentDuration() {
        return null;
    }
    public static void main(String[] args) {
        
    }
 
}
    
    

package adivaJmartFH;

public class Jmart
{
    public static void main (String[] args){
        System.out.println("test");
    }
    public int getPromo () {
        return 0;
    }
    public String getCustomer () {
        return "oop";
    }
    public float getDiscountPercentage(int before, int after){
        float discount = 0;
        if (before > after) {
            discount = before - after;
        }
        else if (before <= after) {
            discount = 0;
        }
        return discount;
    }
}
    
    

package adivaJmartFH;


public class ShipmentDuration
{
    // instance variables - replace the example below with your own
    public static final int INSTANT = 1 << 0;
    public static final int SAME_DAY = 1 << 1;
    public static final int NEXT_DAY = 1 << 2;
    public static final int REGULER = 1 << 3;
    public static final int KARGO = 1 << 4;

    public ShipmentDuration(int bit) {
         if (bit == 1) {
             bit = INSTANT;
         }
         else if (bit == 2) {
             bit = SAME_DAY;
         }
         else if (bit == 4) {
             bit = NEXT_DAY;
         }
         else if (bit == 8) {
             bit = REGULER;
         }
         else if (bit == 16) {
             bit = KARGO;
         }
    }
    
    /*public ShipmentDuration(ShipmentDuration... args) {
        
        
    }*/

}

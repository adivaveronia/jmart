package adivaJmartFH;


public class ShipmentDuration
{
    // instance variables - replace the example below with your own
    public static final int INSTANT = 1 << 0; //(0000 0001)
    public static final int SAME_DAY = 1 << 1; //(0000 0010)
    public static final int NEXT_DAY = 1 << 2;
    public static final int REGULER = 1 << 3;
    public static final int KARGO = 1 << 4;
    private int bit;
    
    private ShipmentDuration(int bit) {
         this.bit = bit;
    }
    
    public ShipmentDuration(int... bit_input) {
        for(int i:bit_input) {
              this.bit = this.bit|i;
        }
    }
    
    public boolean isDuration(ShipmentDuration reference) {
        if((reference.bit & this.bit) != 0) {
            return true;
        }
        return false;
    }
}

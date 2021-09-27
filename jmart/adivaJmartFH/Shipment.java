package adivaJmartFH;


/**
 * Write a description of class Shipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shipment implements FileParser
{
    public String address;
    public int shipmentCost;
    //public Duration duration;
    public String receipt;
    
    /*public static class Duration{
        // instance variables - replace the example below with your own
        public final Duration INSTANT = new Duration(1<<0); //(0000 0001)
        public final Duration SAME_DAY = new Duration(1<<1); //(0000 0010)
        public final Duration NEXT_DAY = new Duration(1<<2);
        public final Duration REGULER = new Duration(1<<3);
        public final Duration KARGO = new Duration(1<<4);
        public byte bit;
        
        private Duration(byte bit) {
             this.bit = bit;
        }
    }*/
    
    public class MultiDuration{
        public byte bit;
        
        /*public MultiDuration(byte... bit_input) {
            for(byte i:bit_input) {
                  this.bit = this.bit|i;
            }
        }*/
        
        /*public boolean isDuration(Duration reference) {
            if((reference.bit & this.bit) != 0) {
                return true;
            }
            return false;
        }*/
    }
    
    /*public Shipment(String address, int shipmentCost, Duration duration, String receipt){
        this.address = address;
        this.shipmentCost = shipmentCost;
        //this.duration = duration;
        this.receipt = receipt;
    }*/
    
    @Override
    public Object write(){
        return null;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
}

package adivaJmartFH;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

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
    public Duration duration;
    public String receipt;
    
    public static class Duration{
        public final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("EEE MMMMMMM dd yyyy");
        public final Duration INSTANT = new Duration((byte)(1<<0)); //(0000 0001)
        public final Duration SAME_DAY = new Duration((byte)(1<<1)); //(0000 0010)
        public final Duration NEXT_DAY = new Duration((byte)(1<<2));
        public final Duration REGULER = new Duration((byte)(1<<3));
        public final Duration KARGO = new Duration((byte)(1<<4));
        public byte bit;
        
        private Duration(byte bit) {
             this.bit = bit;
        }
        
        public String getEstimatedArrival(Date reference){
            Calendar day = Calendar.getInstance();
            day.add(Calendar.DATE, 1);
            return ESTIMATION_FORMAT.format(day.getTime()); 
        }
    }
    
    public class MultiDuration{
        public byte bit;
        
        public MultiDuration(Duration... args) {
            for(Duration i:args) {
                  this.bit |= i.bit;
            }
        }
        
        public boolean isDuration(Duration reference) {
            if((reference.bit & this.bit) != 0) {
                return true;
            }
            return false;
        }
    }
    
    public Shipment(String address, int shipmentCost, Duration duration, String receipt){
        this.address = address;
        this.shipmentCost = shipmentCost;
        this.duration = duration;
        this.receipt = receipt;
    }
    
    @Override
    public Object write(){
        return null;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
}

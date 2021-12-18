package com.adivaJmartFH;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * @author Adiva Veronia
 */
public class Shipment
{
    public String address;
    public int cost;
    public byte plan;
    public String receipt;

    public final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("EEE MMMMMMM dd yyyy");
    public final Plan INSTANT = new Plan((byte)(1<<0)); //(0000 0001)
    public final Plan SAME_DAY = new Plan((byte)(1<<1)); //(0000 0010)
    public final Plan NEXT_DAY = new Plan((byte)(1<<2));
    public final Plan REGULER = new Plan((byte)(1<<3));
    public final Plan KARGO = new Plan((byte)(1<<4));
    public byte bit;

    public String getEstimatedArrival(Date reference){
        Calendar day = Calendar.getInstance();
        if(bit == (1<<0)) {
            return ESTIMATION_FORMAT.format(reference.getTime());
        }
        else if(bit == (1<<1)) {
            return ESTIMATION_FORMAT.format(reference.getTime());
        }
        else if(bit == (1<<2)) {
            day.setTime(reference);
            day.add(Calendar.DATE, 1);
            return ESTIMATION_FORMAT.format(day.getTime());
        }
        else if(bit == (1<<3)) {
            day.setTime(reference);
            day.add(Calendar.DATE, 2);
            return ESTIMATION_FORMAT.format(day.getTime());
        }
        else {
            day.setTime(reference);
            day.add(Calendar.DATE, 5);
            return ESTIMATION_FORMAT.format(day.getTime());
        }
    }

    public boolean isDuration(Plan reference) {
        if((reference.bit & this.plan) != 0) {
            return true;
        }
        return false;
    }

    public boolean isDuration(byte Object, Plan reference) {
        if((reference.bit & Object) != 0) {
            return true;
        }
        return false;
    }

    /**
     * Konstruktor menginstansiasi variabel sesuai parameter
     */
    public Shipment(String address, int cost, byte plan, String receipt) {
        this.address = address;
        this.cost = cost;
        this.plan = plan;
        this.receipt = receipt;
    }

    public static class Plan {
        public final byte bit;

        private Plan(byte bit) {
            this.bit = bit;
        }
    }
}

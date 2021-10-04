package adivaJmartFH;
import java.util.ArrayList;

/**
 * Write a description of class Filter here.
 *
 * @author (Adiva Veronia)
 * @version (02/10/2021)
 */
public class Filter
{
    public static ArrayList<PriceTag> filterPriceTag(PriceTag[] list, double value, boolean less) {
        ArrayList<PriceTag> filter = new ArrayList<PriceTag>();
        if(less == true) {
            for(int i = 0; i < list.length; i++) {
                filter.add(list[i]);
            }
        }else {
            for(int i = 0; i < list.length; i++) {
                if(list[i].getAdjustedPrice() >= value) {
                    filter.add(list[i]);
                }
            }
        }
        return null;
    }
    public static void filterProductRating(ArrayList<ProductRating> list, double value, boolean less){
    }
}

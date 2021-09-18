package adivaJmartFH;

public class ProductRating
{
    private long total;
    private long count;
    
    public ProductRating() {
        total = 0;
    }
    
    public void insert (int rating) {
        total = rating;
        count++;
    }
    
    public double getAverage() {
        return total/count; 
    }
    
    public long getCount() {
        return count;
    }
    
    public long getTotal() {
        return total;
    }
}

package adivaJmartFH;

public class Product extends Recognizable {
    public int storeId;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;
    //public MultiDuration multiDuration;
    
    public Product(int id, int storeId, String name, int weight, boolean conditionUsed, PriceTag priceTag, ProductCategory category) {
        super(id);
        this.storeId = storeId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
    }

    public boolean read(String name) {
        return true;
    }
    
    public String toString() {
        return "name" + name + "\n" + "Weight: 1\nconditionedUsed:" + conditionUsed;
    }
}

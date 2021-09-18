package adivaJmartFH;

public class Product
{
    private int idCounter;
    public int id;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public Pricetag pricetag;
    public ProductCategory category;
    public ProductRating rating;
    
    public Product(String name, int weight, boolean conditionUsed, Pricetag pricetag, ProductCategory category){
        name = name;
        weight = weight;
        conditionUsed = conditionUsed;
        pricetag = pricetag;
        category = category;
        id = idCounter;
        rating = new ProductRating(rating);
    }
}

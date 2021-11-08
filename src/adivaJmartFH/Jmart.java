package adivaJmartFH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

public class Jmart
{
    public static List<Product> filterByAccountId(List<Product> list, int accountId, int page, int pageSize){
        return null;
    }

    public static List<Product> filterByCategory(List<Product> list, ProductCategory category){
        return null;
    }

    public static List<Product> filterByName(List<Product> list, String search, int page, int pageSize){
        return null;
    }
    public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice){

        return null;
    }

    public static void main(String[] args) {
        try
        {
            List<Product> list = read("C:/Users/adiva/Documents/jmart/randomProductList.json");
            List<Product> filtered = filterByPrice(list, 0.0, 20000.0);
            filtered.forEach(product -> System.out.println(product.price));
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }
    }

    private static List<Product> paginate (List<Product> list, int page, int pageSize, Predicate<Product> pred){
        return null;
    }

    public static List<Product> read (String filePath){
        Gson gson = new Gson();
        List<Product> list = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            Product input = gson.fromJson(br, Product.class);
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                //list.add(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
    
    

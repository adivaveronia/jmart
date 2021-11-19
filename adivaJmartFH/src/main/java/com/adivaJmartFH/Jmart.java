package com.adivaJmartFH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Jmart
{
    public static long DELIVERED_LIMIT_MS = 0;
    public static long ON_DELIVERED_LIMIT_MS = 1;
    public static long ON_PROGRESS_LIMIT_MS = 2;
    public static long WAITING_CONF_LIMIT_MS = 3;

    public static void main(String[] args){
        SpringApplication.run(Jmart.class, args);
    }

    public static boolean paymentTimekeeper(Payment payment){
        return false;
    }

    /*public static List<Product> filterByAccountId(List<Product> list, int accountId, int page, int pageSize){
        return null;
    }

    public static List<Product> filterByCategory(List<Product> list, ProductCategory category){
        return null;
    }

    public static List<Product> filterByName(List<Product> list, String search, int page, int pageSize){
        return null;
    }
    public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice){
        List<Product> tempList = new ArrayList<>();
        Iterator<Product> iterator = list.iterator();
        /*if(minPrice != 0.0){
            for(Product eachElement: list){
                if(eachElement.product != minPrice){

                }
            }
            list.
        }*/
      //  return null;
    //}

    /*public static void main(String[] args) {
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
    }*/

}
    
    

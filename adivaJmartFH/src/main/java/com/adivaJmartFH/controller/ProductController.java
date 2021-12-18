package com.adivaJmartFH.controller;

import com.adivaJmartFH.*;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.adivaJmartFH.controller.AccountController.accountTable;

/**
 * @author adiva
 */
@RestController
@RequestMapping("/product")
public class ProductController implements BasicGetController<Product> {

    public static @JsonAutowired
            (value = Product.class, filepath = "Product.json")
    JsonTable<Product> productTable;

    /**
     * @return instance variabel productTable.
     */
    @Override
    public JsonTable<Product> getJsonTable() {
        return productTable;
    }

    /**
     * Melakukan paginasi dan memberikan Predicate bahwa parameter id yg dimaksud
     * adalah Product.accountId
     * @param id parameter id yang dimaksud adalah Product.accountId
     */
    @GetMapping("/{id}/store")
    List<Product> getProductByStore(@RequestParam int id, @RequestParam int page, @RequestParam int pageSize){
        return null;
    }

    /**
     * Menambahkan object ke dalam json table
     * @param accountId id dari Account
     * @param name nama dari store yang telah terdaftar
     * @param weight berat dari store yang telah terdaftar
     * @param conditionUsed kondisi barang dari store yang telah terdaftar
     * @param price harga barang dari store yang telah terdaftar
     * @param discount diskon dari store yang telah terdaftar
     * @param category kategori dari store yang telah terdaftar
     * @param shipmentPlans rencana pengiriman dari store yang telah terdaftar
     * @return product yang telah di-instansiasi
     */
    @PostMapping("/create")
    Product create(@RequestParam int accountId,
                   @RequestParam String name,
                   @RequestParam int weight,
                   @RequestParam boolean conditionUsed,
                   @RequestParam double price,
                   @RequestParam double discount,
                   @RequestParam ProductCategory category,
                   @RequestParam byte shipmentPlans) {
        if (productTable.contains(accountId) && accountTable.contains(accountId)) {
            Product product = new Product(accountId, name, weight, conditionUsed, price, discount, category, shipmentPlans);
            productTable.add(product);
            return product;
        } else {
            return null;
        }
    }


    /**
     * Melakukan penyaringan terhadap Product dalam productTable
     * @see <a href=https://www.baeldung.com/spring-request-param></a>
     */
    @GetMapping("/getFiltered")
    List<Product> getProductFiltered(@RequestParam int page,
                                     @RequestParam int pageSize,
                                     @RequestParam int accountId,
                                     @RequestParam String search,
                                     @RequestParam int minPrice,
                                     @RequestParam int maxprice,
                                     @RequestParam ProductCategory category){
        return null;
    }

}

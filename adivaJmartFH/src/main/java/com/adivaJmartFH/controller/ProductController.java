package com.adivaJmartFH.controller;

import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.Payment;
import com.adivaJmartFH.Product;
import com.adivaJmartFH.ProductCategory;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class ProductController implements BasicGetController<Product> {

    public static @JsonAutowired
            (value = Product.class, filepath = "C:\\Users\\adiva\\Documents\\randomProductList")
    JsonTable<Product> productTable;

    @Override
    public JsonTable<Product> getJsonTable() {
        return productTable;
    }

    @GetMapping("/{id}/store")
    List<Product> getProductByStore(int id, int page, int pageSize){
        return null;
    }

    @PostMapping("/create")
    Product create(int accountId, String name, int weight, boolean conditionUsed, double price, double discount, ProductCategory category, byte shipmentPlans){
        return null;
    }

    @Override
    public List<Product> getPage(int page, int pageSize) {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }



}

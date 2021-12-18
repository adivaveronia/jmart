package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.Coupon;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author adiva
 */
@RestController
@RequestMapping("/coupon")
public class CouponController implements BasicGetController<Coupon>{
    public static @JsonAutowired
            (value = Coupon.class, filepath = "Coupon.json")
    JsonTable<Coupon> couponTable;

    @GetMapping("{id}/isUsed")
    public boolean isUsed(int id){
        return true;
    }

    @GetMapping("/{id}/canApply")
    public boolean canApply(int id, double price, double discount){
        //return Coupon.canApply();
        return false;
    }

    @GetMapping("/{id}/getAvailable")
    public List<Coupon> getAvailable(){
        return null;
    }

    @Override
    public JsonTable<Coupon> getJsonTable() {
        return couponTable;
    }



}

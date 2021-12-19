package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.Coupon;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * Menggambarkan status dari produk apakah sudah pernah digunakan atau belum
     * @param id id produk
     * @return
     */
    @GetMapping("{id}/isUsed")
    public boolean isUsed(@RequestParam int id){
        return true;
    }

    /**
     * @param id id produk
     * @param price harga produk
     * @param discount harga discount produk
     * @return
     */
    @GetMapping("/{id}/canApply")
    public boolean canApply(@RequestParam int id, @RequestParam double price, @RequestParam double discount){
        //return Coupon.canApply();
        return false;
    }

    /**
     * @return List coupon dapat digunakan (status used = false) yang dipaginasi.
     */
    @GetMapping("/{id}/getAvailable")
    public List<Coupon> getAvailable(){
        return null;
    }

    /**
     * @return variabel instance dari couponTable
     */
    @Override
    public JsonTable<Coupon> getJsonTable() {
        return couponTable;
    }


}

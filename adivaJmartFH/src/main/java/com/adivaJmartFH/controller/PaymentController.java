package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.JsonTable;
import com.adivaJmartFH.ObjectPoolThread;
import com.adivaJmartFH.Payment;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment>{
    public static final long DELIVERED_LIMIT_MS = 0;
    public static final long ON_DELIVERED_LIMIT_MS = 1;
    public static final long ON_PROGRESS_LIMIT_MS = 2;
    public static final long WAITING_CONF_LIMIT_MS = 3;
    public static @JsonAutowired
            (value = Payment.class, filepath = "C:\\Users\\adiva\\Documents\\randomProductList")
    JsonTable<Payment> paymentTable;
    public ObjectPoolThread<Payment> poolThread;

    @Override
    public List<Payment> getPage(int page, int pageSize) {
        return null;
    }

    @Override
    public Payment getById(int id) {
        return null;
    }

    public JsonTable<Payment> getJsonTable(){
        return paymentTable;
    }

    @PostMapping("/create")
    boolean create(int buyerId, int productId, int productCount){
        int cost = 0;
        String receipt = null;
        //Payment.getTotalPay(Product);
        return false;
    }

    @PostMapping("/accept")
    boolean accept(int id){
        return false;
    }

    @PostMapping("/cancel")
    Payment cancel(int id){
        return null;
    }

    @PostMapping("/submit")
    boolean submit(int id, String receipt){
        return false;
    }


}

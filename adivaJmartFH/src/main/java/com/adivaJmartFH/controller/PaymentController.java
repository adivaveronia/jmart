package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.JsonTable;
import com.adivaJmartFH.Payment;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public JsonTable<Payment> getJsonTable(){
        return paymentTable;
    }
}

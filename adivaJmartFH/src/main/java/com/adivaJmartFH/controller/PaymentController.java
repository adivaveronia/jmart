package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.ObjectPoolThread;
import com.adivaJmartFH.Payment;
import com.adivaJmartFH.dbjson.JsonAutowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.adivaJmartFH.Jmart.paymentTimekeeper;

/**
 * @author adiva
 */
@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment>{
    public static final long DELIVERED_LIMIT_MS = 0;
    public static final long ON_DELIVERED_LIMIT_MS = 1;
    public static final long ON_PROGRESS_LIMIT_MS = 2;
    public static final long WAITING_CONF_LIMIT_MS = 3;
    public static @JsonAutowired
            (value = Payment.class, filepath = "Payment.json")
    JsonTable<Payment> paymentTable;
    public ObjectPoolThread<Payment> poolThread;

    /**
     * @return Instance variabel paymentTable
     */
    public JsonTable<Payment> getJsonTable(){
        return paymentTable;
    }

    /**
     * Mutasi balance Account terhadap harga yang dibebankan
     * Inisiasikan Payment history dengan menambahkan Payment.Record yang berstatus
     * Invoice.Status.WAITING_CONFIRMATION.
     * Menambahkan product yang di-instansiasikan ke json table dan object pool thread
     * @param buyerId mengarah pada accountTable
     * @param productId mengarah pada productTable
     * @param productCount mengacu pada jumlah produk
     * @return Produk yang di-instansiasi apabila sesuai dengan kriteria
     * yang dimaksud, jika tidak null
     */
    @PostMapping("/create")
    boolean create(@RequestParam int buyerId, @RequestParam int productId, @RequestParam int productCount, @RequestParam String shipmentAddress, @RequestParam byte shipmentPlan){
        int cost = 0;
        String receipt = null;
        return false;
    }

    /**
     * History terbarunya adalah Invoice.Status.WAITING_CONFIRMATION.
     * Menambahkan Payment.history dengan status Invoice.Status.ON_PROGRESS.
     * @param id id yang dimaksud tersedia
     * @return true jika memenuhi kriteria, false jika sebaliknya
     */
    @PostMapping("/accept")
    boolean accept(@RequestParam int id){
        return false;
    }

    /**
     * History terbarunya adalah Invoice.Status.WAITING_CONFIRMATION.
     * Menambahkan Payment.history dengan status Invoice.Status.CANCELLED
     * @param id id yang dimaksud tersedia
     * @return true jika memenuhi kriteria, false jika sebaliknya
     */
    @PostMapping("/cancel")
    Payment cancel(@RequestParam int id){
        return null;
    }

    /**
     * History terbarunya adalah Invoice.Status.ON_PROGRESS.
     * Menambahkan Payment.history dengan status Invoice.Status.ON_DELIVERY
     * @param id id yang dimaksud tersedia
     * @param receipt tidak blank
     * @return true jika memenuhi kriteria, false jika sebaliknya
     */
    @PostMapping("/submit")
    boolean submit(@RequestParam int id, @RequestParam String receipt){
        return false;
    }

    /**
     * Untuk routine dalam ObjectPoolThread
     */
    private static boolean timekeeper(Payment payment){

        return paymentTimekeeper(payment);
    }

}

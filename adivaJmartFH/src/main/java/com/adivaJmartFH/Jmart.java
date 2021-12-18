package com.adivaJmartFH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.adivaJmartFH.dbjson.JsonDBEngine;
import com.google.gson.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adiva Veronia
 * Main Class
 */
@SpringBootApplication
@RestController
public class Jmart {
    public static long DELIVERED_LIMIT_MS = 0;
    public static long ON_DELIVERED_LIMIT_MS = 1;
    public static long ON_PROGRESS_LIMIT_MS = 2;
    public static long WAITING_CONF_LIMIT_MS = 3;

    public static void main(String[] args){

        JsonDBEngine.Run(Jmart.class);
        SpringApplication.run(Jmart.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> JsonDBEngine.join()));
    }

    /**
     * Digunakan sebagai routine (Function<T, Boolean>) dalam ObjectPoolThread
     */
    public static boolean paymentTimekeeper(Payment payment){

        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;

        if (payment.history.equals(Invoice.Status.WAITING_CONFIRMATION) && timeElapsed > WAITING_CONF_LIMIT_MS)
        {
            payment.history.add(new Payment.Record(Invoice.Status.FAILED, "FAILED"));
        }
        else if(payment.history.equals(Invoice.Status.ON_PROGRESS) && timeElapsed > ON_PROGRESS_LIMIT_MS)
        {
            payment.history.add(new Payment.Record(Invoice.Status.FAILED, "FAILED"));
        }
        else if(payment.history.equals(Invoice.Status.ON_DELIVERY) && timeElapsed > ON_DELIVERED_LIMIT_MS)
        {
            payment.history.add(new Payment.Record(Invoice.Status.ON_DELIVERY, "ON_DELIVERY"));
            return true;
        }
        else if(payment.history.equals(Invoice.Status.FINISHED) && timeElapsed > DELIVERED_LIMIT_MS)
        {
            payment.history.add(new Payment.Record(Invoice.Status.FINISHED, "DELIVERED"));
            return true;
        }

        return false;
    }

}
    
    

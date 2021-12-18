package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.Algorithm;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.dbjson.Serializable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author adiva
 */
@RestController
@RequestMapping("/home")
public interface BasicGetController <T extends Serializable> {

    /**
     * Mereferensikan pada collection yang didapatkan dari getJsonTable()
     * Melakukan paginasi
     * @return paginasi dengan method yang sudah dibuat
     */
    @GetMapping("/page")
    default List<T> getPage(@RequestParam int page, @RequestParam int pageSize){
        final JsonTable<T> table = getJsonTable();
        return Algorithm.paginate(table, page, pageSize, o -> true);
    }

    /**
     * Mereferensikan pada collection yang didapatkan dari getJsonTable()
     * @param id id yang telah ada
     * @return Objek T yang memiliki id sesuai parameter
     */
    @GetMapping("/{id}")
    default T getById(@PathVariable int id){
        return Algorithm.<T>find(getJsonTable(),e -> e.id == id);
    }

    abstract JsonTable<T> getJsonTable();
}

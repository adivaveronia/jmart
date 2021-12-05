package com.adivaJmartFH.controller;

import com.adivaJmartFH.Account;
import com.adivaJmartFH.Algorithm;
import com.adivaJmartFH.dbjson.JsonTable;
import com.adivaJmartFH.Serializable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public interface BasicGetController <T extends Serializable> {
    @GetMapping("/page")
    default List<T> getPage(@RequestParam int page, @RequestParam int pageSize){
        final JsonTable<T> table = getJsonTable();
        return Algorithm.paginate(table, page, pageSize, o -> true);
    }
    @GetMapping("/{id}")
    default T getById(@PathVariable int id){
        return Algorithm.<T>find(getJsonTable(),e -> e.id == id);
    }

    abstract JsonTable<T> getJsonTable();
}

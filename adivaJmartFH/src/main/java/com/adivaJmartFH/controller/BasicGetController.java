package com.adivaJmartFH.controller;

import com.adivaJmartFH.Serializable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public interface BasicGetController <T extends Serializable> {
    /*@GetMapping("/page")
    @ResponseBody List<T> getPage(int page, int pageSize);
    @GetMapping("/{id}")
    @ResponseBody T getById(int id);*/
}

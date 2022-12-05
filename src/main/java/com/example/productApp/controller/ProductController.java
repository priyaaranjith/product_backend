package com.example.productApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to website";
    }
    @PostMapping("/add")
    public String AddProduct(){
        return "Welcome to add products page";

    }
}

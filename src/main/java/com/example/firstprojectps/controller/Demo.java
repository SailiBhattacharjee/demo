package com.example.firstprojectps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Demo {
    @Autowired
    BookService bookservice;

    @GetMapping("/demo")
    public String apple() {
        bookservice.savename();
        return "demo";
    }

}

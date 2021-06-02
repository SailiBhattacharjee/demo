package com.example.firstprojectps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Demo {
    @Autowired
    BookService bookservice;

    @GetMapping("/savebook")
    public String saveBook() {
        bookservice.savename();
        return "demo";
    }

    @GetMapping("/getbook")
    public Books getBook() {
        Books booksList = bookservice.getname();
        return booksList;
    }

    @GetMapping("/updatebook/{id}")
    public Books updateBook(@PathVariable int id) {
        bookservice.updatebook(id);
        return null;
    }


}

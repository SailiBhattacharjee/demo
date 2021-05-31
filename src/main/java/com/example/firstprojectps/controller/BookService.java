package com.example.firstprojectps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBooks books;

    public void savename() {
        Books b = new Books();
        books.save(b);
    }
}

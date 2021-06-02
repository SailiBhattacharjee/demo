package com.example.firstprojectps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBooks books;

    public void savename() {
        Books b = new Books();
        books.save(b);
    }

    public Books getname() {
        List<Books> booksAll = books.findAll();
        Books books = booksAll.get((booksAll.size()/2));
        System.out.println(books);
        return books;
    }

    public Books updatebook(int id) {

        books.setBookInfoById("rupak",id);


        return null;
    }
}

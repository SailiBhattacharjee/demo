package com.example.firstprojectps.controller;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Books {

    @Id
    public int bookId=2;

    public String bookName = "pritam";

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    public Books(){

    }
}

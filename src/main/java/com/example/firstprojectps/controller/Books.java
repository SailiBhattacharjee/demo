package com.example.firstprojectps.controller;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {

    @Id
    public int bookId;

    public String bookName = "SAI";

    public Books(){

    }
}

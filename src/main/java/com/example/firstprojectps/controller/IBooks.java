package com.example.firstprojectps.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IBooks extends JpaRepository<Books,Integer> {
    @Transactional
    @Modifying
    @Query(value = "update books  set book_name = :firstname where book_id = :userId",nativeQuery = true)
    void setBookInfoById(String firstname,  Integer userId);
}

package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.petstore;

import java.util.List;

public interface PetService {

    List<petstore> selectAll();

    void insert1(Integer id ,String name,Integer Age,String Sex,String time,String attention);
    void delete1(Integer id);
    void update(Integer id ,String name,Integer Age,String Sex,String time,String attention);

}

package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.petstore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {

    void insert1(Integer id ,String name,Integer Age,String Sex,String time,String attention);
    void delete1(Integer id);
    void update(Integer id ,String name,Integer Age,String Sex,String time,String attention);
    List<petstore> selectAll();
}

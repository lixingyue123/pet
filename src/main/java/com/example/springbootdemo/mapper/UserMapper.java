package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    UserBean getInfo(String name,String password);

}

package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.UserBean;

import java.util.List;

public interface UserService {
    UserBean logIn(String name,String password);

}

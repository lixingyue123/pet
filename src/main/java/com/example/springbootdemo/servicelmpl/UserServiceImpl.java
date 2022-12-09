package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入service层
    @Resource
    private UserMapper userMapper;
    public UserBean logIn(String name,String password){
        return userMapper.getInfo(name, password);
    }

}

package com.example.springbootdemo;

import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootdemoApplicationTests {
    @Resource
    UserService userService;
    @Test
    void contextLoads() {
//        UserBean userBean=userService.Select("lxy");
//        System.out.println("user ID is: ");
//        System.out.println(userBean.getId());
//        UserBean x1=new UserBean();
//        x1.setId(6);
//        x1.setName("guang");
//        x1.setPassword("123");
//        int x=userService.Insert(x1);
      //  List<UserBean> u=userService.FindAll();
    }

}

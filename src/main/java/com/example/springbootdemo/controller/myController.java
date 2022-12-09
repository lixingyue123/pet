package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class myController {
//    @RequestMapping("/test")
//    public String test1(){
//        return "test";
//    }
    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg","标准变量表达式");

        UserBean blog=new UserBean();
        blog.setId(1);
        blog.setName("lxy");
        blog.setPassword("123456");

        model.addAttribute("blog",blog);
        return "test";
    }

//    @RequestMapping("/blog")
//    @ResponseBody
//    public String getUserById(Integer id) {
//
//        System.out.println("id=" + id);
//        return "id=" + id;
//    }


//    @RequestMapping("/blogList")
//    public String hello(Model model) {
//        List<UserBean> blogList = new ArrayList<>();
//
//        for (int i = 1; i <= 3; i++) {
//            UserBean blog=new UserBean();
//            blog.setId(i);
//            blog.setPassword("abcd"+i);
//            blog.setName("一心"+i);
//            blogList.add(blog);
//        }
//
//        model.addAttribute("blogList", blogList);
//        return "test";
//    }
//

}

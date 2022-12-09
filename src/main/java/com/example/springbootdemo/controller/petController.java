package com.example.springbootdemo.controller;


import com.example.springbootdemo.bean.petstore;
import com.example.springbootdemo.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Controller

public class petController {
    //将Service注入web层
    @Resource
    PetService petService;

    @RequestMapping("/pet")
    public String show(){return "pet"; }

    @RequestMapping(value = "/Insert1",method = RequestMethod.POST)
    public String insertMethod(Integer id, String name,Integer Age, String Sex,String time,String attention , Model model) {
        petService.insert1(id,name,Age,Sex,time,attention);
        String msg=null;
        msg="插入成功";
        model.addAttribute("msg1",msg);
        return "pet";
    }

    @RequestMapping(value = "/Delete1",method = RequestMethod.POST)
    public String deleteMethod(Integer id, Model model) {
        petService.delete1(id);
        String msg=null;
        msg="删除成功";
        model.addAttribute("msg1",msg);
        return "pet";
    }

    @RequestMapping(value = "/update1",method = RequestMethod.POST)
    public String updateMethod(Integer id, String name,Integer Age, String Sex,String time,String attention , Model model) {
        petService.update(id,name,Age,Sex,time,attention);
        String msg=null;
        msg="更新成功";
        model.addAttribute("msg1",msg);
        return "pet";
    }

    @RequestMapping(value = "/SelectAll",method = RequestMethod.POST)
    public String selectALL(Model model){
        List<petstore> petList= petService.selectAll();
        String tableHeaders="<tr><th>宠物编号</th><th>宠物姓名</th><th>宠物年龄</th><th>宠物性别</th><th>就诊时间</th><th>病情</th></tr>";
        String petsHTML="";
        petsHTML+=tableHeaders;
        Iterator<petstore> iterator=petList.iterator();
        String pHTML;
        while(iterator.hasNext()){
            petstore a=iterator.next();
            pHTML="<tr><td>"+a.getId()+"</td><td>"+a.getName()+"</td><td>"+a.getAge()+"</td><td>"+a.getSex()+"</td><td>"+a.getTime()+"</td><td>"+a.getAttention()+"</td></tr>";
            petsHTML+=pHTML;
        }
        String msg="查询成功";
        model.addAttribute("msg1",msg);
        model.addAttribute("info","<table id='table' width=\"50%\" border=\"=1px\">"+petsHTML+"</table>");
        System.out.println(model);
        return "pet";
    }

}

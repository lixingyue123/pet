package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.petstore;
import com.example.springbootdemo.mapper.PetMapper;
import com.example.springbootdemo.service.PetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    @Resource
    private PetMapper petMapper;

    @Override
    public List<petstore> selectAll() {
        System.out.println("查询成功");
        return petMapper.selectAll();
    }


    @Override
    public void insert1(Integer id, String name, Integer Age, String Sex, String time, String attention) {
        petMapper.insert1(id, name, Age, Sex, time, attention);
    }


    public void delete1(Integer id) {
        petMapper.delete1(id);
    }

    public void update(Integer id, String name, Integer Age, String Sex, String time, String attention) {
        petMapper.update(id, name, Age, Sex, time, attention);
    }
}

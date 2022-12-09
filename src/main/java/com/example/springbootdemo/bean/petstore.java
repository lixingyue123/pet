package com.example.springbootdemo.bean;

public class petstore {
    private Integer pet_ID;
    private String pet_Name;
    private Integer Age;
    private String Sex;
    private String visit_time;
    private String visit_attention;

    public Integer getId(){ return pet_ID; }
    public void setId(int id) {
        this.pet_ID = id;
    }
    public String getName(){return pet_Name;}
    public void setName(String name) {
        this.pet_Name = name;
    }
    public Integer getAge(){return Age;}
    public void setAge(int age) {
        this.Age = age;
    }
    public String getSex(){return Sex;}
    public void setSex(String sex) {
        this.Sex = sex;
    }
    public String getTime(){return visit_time;}
    public void setTime(String time) {
        this.visit_time = time;
    }

    public String getAttention(){return visit_attention;}
    public void setAttention(String attention) {
        this.visit_attention = attention;
    }
    @Override
    public String toString(){
        return "User{"+
                "id="+pet_ID+",name="+pet_Name+",age="+Age+",sex="+Sex+",visit_time="+visit_time+",visit_attention="+visit_attention+"}";
    }
}

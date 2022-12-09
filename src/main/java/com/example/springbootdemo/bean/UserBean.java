package com.example.springbootdemo.bean;

public class UserBean {
    private int id;
    private String name;
//    private int Age;
//    private String Sex;
//    private String time;
//    private String attention;
    private String password;

    public int getId(){ return id; }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){return name;}
    public void setName(String name) {
        this.name = name;
    }
//    public int getAge(){return Age;}
//    public void setAge(int age) {
//        this.Age = age;
//    }
//    public String getTime(){return time;}
//    public void setTime(String time) {
//        this.time = time;
//    }
//    public String getAttention(){return attention;}
//    public void setAttention(String attention) {
//        this.attention = attention;
//    }
    public String getPassword(){return password;}
    public void setPassword(String pwd) {
        this.password = pwd;
    }
    @Override
    public String toString(){
        return "User{"+
                "id="+id+",name="+name+",password="+password+"}";
    }
}

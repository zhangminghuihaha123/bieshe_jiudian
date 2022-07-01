package com.zmh.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {

    private int id;
    private String password;
    private String name;
    private Date time;
    private char sex;
    private String age;
    private long phonenumber;
    private String userimg;

    public User(int id, String password, String name, Date time, char sex, String age, long phonenumber) {
        this.id=id;
        this.password=password;
        this.name=name;
        this.time=time;
        this.sex=sex;
        this.age=age;
        this.phonenumber=phonenumber;
    }

    public User(String name,String userimg) {
        this.name=name;
        this.userimg=userimg;
    }


}

package com.zmh.demo.service;

import com.zmh.demo.dao.userinDao;
import com.zmh.demo.pojo.ListD;
import com.zmh.demo.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class userinService {

    @Autowired
    private userinDao userinDao;

    public int UserRoomTotal(String user){
        return userinDao.UserRoomTotal(user);
    }

    public List<ListD> returnD(String user){
        return userinDao.returnD(user);
    }

    public void userDeleteOne(int roomnum){
        userinDao.userDeleteOne(roomnum);
    }

    public String usergetyhk(int roomnum){
       return userinDao.usergetyhk(roomnum);
    }

    public int gettotal(int roomnum){
        return userinDao.gettotal(roomnum);
    }

    public void updatecard(String yhk,int money){
        userinDao.updatecard(yhk,money);
    }

    public void inusercall(String name,int room,String call){
        userinDao.inusercall(name, room, call);
    }

    public String getRoomStyle(int roomnum){
        return userinDao.getRoomStyle(roomnum);
    }

    public int getMoney1(){
        return userinDao.getMoney1();
    }

    public void InMoney1(Money money){
        userinDao.InMoney1(money);
    }
}

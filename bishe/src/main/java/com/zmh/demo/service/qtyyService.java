package com.zmh.demo.service;

import com.zmh.demo.dao.qtyyDao;
import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Friends;
import com.zmh.demo.pojo.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class qtyyService {

    @Autowired
    private qtyyDao qtyyDao;

    public void setroomStyle(Rooms rooms){
        qtyyDao.setroomStyle(rooms);
    }

    public void updateroomStyle(String path,String roomstyle){
        qtyyDao.updateroomStyle(path,roomstyle);
    }

    public List<String> returnroomstyle(){
        return qtyyDao.returnroomstyle();
    }

    public void setfoodStyle(Foods foods){
        qtyyDao.setfoodStyle(foods);
    }

    public List<String> returnfoodstyle(){
        return qtyyDao.returnfoodstyle();
    }

    public void updatefoodStyle(String path,String foodStyle){
        qtyyDao.updatefoodStyle(path,foodStyle);
    }

    public List<String> returnfiendsstyle(){
        return qtyyDao.returnfiendsstyle();
    }

    public void setfriendStyle(Friends friends){
        qtyyDao.setfriendStyle(friends);
    }

    public void deletefriends(String friendname){
        qtyyDao.deletefriends(friendname);
    }

    public int returnUserCallNum(){
        return qtyyDao.returnUserCallNum();
    }
}

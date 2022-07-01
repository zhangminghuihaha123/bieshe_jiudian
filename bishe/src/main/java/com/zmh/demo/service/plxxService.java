package com.zmh.demo.service;

import com.zmh.demo.dao.plxxDao;
import com.zmh.demo.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class plxxService {

    @Autowired
    private plxxDao plxxDao;


    public List<Room> retunRooms(String user){
        return plxxDao.retunRooms(user);
    }

    public void tocents(String user,String rooms,String call){
        plxxDao.tocents(user, rooms, call);
    }

    public String getPlxxOk(String user){
        return plxxDao.getPlxxOk(user);
    }
}

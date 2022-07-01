package com.zmh.demo.service;

import com.zmh.demo.dao.yxDao;
import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class yxService {

    @Autowired
    private yxDao yxDao;

    public List<Rooms>  returnListRooms(){
        return yxDao.returnListRooms();
    }

    public List<Foods> returnListFoods(){
        return yxDao.returnListFoods();
    }

    public void updateRoomMoney(String room,int money){
        yxDao.updateRoomMoney(room, money);
    }

    public void updateFoodMoney(String food,int money){
        yxDao.updateFoodMoney(food, money);
    }
}

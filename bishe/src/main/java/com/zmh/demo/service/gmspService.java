package com.zmh.demo.service;

import com.zmh.demo.dao.gmspDao;
import com.zmh.demo.pojo.Call;
import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gmspService {

    @Autowired
    private gmspDao gmspDao;

    public List<Foods> returnFoodList(){
        return gmspDao.returnFoodList();
    }

    public int returnyhkMoney(String user){
        return gmspDao.returnyhkMoney(user);
    }

    public int returnFoodMoney(String food){
        return gmspDao.returnFoodMoney(food);
    }

    public void updateMoneys(String user,int money){
        gmspDao.updateMoneys(user, money);
    }

    public void InMoney1(Money money){
        gmspDao.InMoney1(money);
    }

    public int GetMoneys(){
        return gmspDao.GetMoneys();
    }

    public int GetFoodKc(String food){
        return gmspDao.GetFoodKc(food);
    }

    public void updateFoodKc(String food,int num){
        gmspDao.updateFoodKc(food, num);
    }

    public void InsertUserCallFood(Call call){
        gmspDao.InsertUserCallFood(call);
    }

    public int ReturnRoomsUser(String user){
        return gmspDao.ReturnRoomsUser(user);
    }
}

package com.zmh.demo.service;

import com.zmh.demo.dao.kcDao;
import com.zmh.demo.pojo.FoodKc;
import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class kcService {

    @Autowired
    private kcDao kcDao;


    public List<Foods> returnfoodlist(){
        return kcDao.returnfoodlist();
    }

    public int returnNumB(String food){
        return kcDao.returnNumB(food);
    }

    public void infoodkc(String food,int num){
        kcDao.infoodkc(food, num);
    }

    public void updatefoodkc(String food,int num){
        kcDao.updatefoodkc(food, num);
    }

    public List<FoodKc> returnFoodKc(){
        return kcDao.returnFoodKc();
    }

    public List<FoodKc> returngetkcstyle(String food){
        return kcDao.returngetkcstyle(food);
    }

    public int returnKcCount(){
        return kcDao.returnKcCount();
    }

    public List<FoodKc> getkctouchs(int num){
        return kcDao.getkctouchs(num*15);
    }

    public List<String> getfoodstyles(){
        return  kcDao.getfoodstyles();
    }

    public String getFoodImage(String food){
        return kcDao.getFoodImage(food);
    }

    public int getFoodmoney(String food){
        return kcDao.getFoodmoney(food);
    }

    public void gettosellFood(String food,int num){
        kcDao.gettosellFood(food, num);
    }

    public void InMoneys(Money money){
        kcDao.InMoneys(money);
    }

    public int returnMoneySelf(){
        return kcDao.returnMoneySelf();
    }
}

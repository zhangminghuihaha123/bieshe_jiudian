package com.zmh.demo.service;

import com.zmh.demo.dao.cwglDao;
import com.zmh.demo.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cwglService {

    @Autowired
    private cwglDao cwglDao;

    public List<Integer> getRoommoney(){
        return cwglDao.getRoommoney();
    }

    public List<Integer> getFoodmoney(){
        return cwglDao.getFoodmoney();
    }

    public List<Integer> getzhichus(){
        return cwglDao.getzhichus();
    }

    public List<Money> returnMoneys(){
        return cwglDao.returnMoneys();
    }

    public int returnNums(){
        return cwglDao.returnNums();
    }

    public List<Money> returnNUmMoney(int num){
        return cwglDao.returnNUmMoney(num*12);
    }

    public List<Money> getMOneyDay(){
        return cwglDao.getMOneyDay();
    }

    public List<Money> getMOneyAgo(){
        return cwglDao.getMOneyAgo();
    }
}


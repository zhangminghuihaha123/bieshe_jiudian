package com.zmh.demo.service;

import com.zmh.demo.dao.xxDao;
import com.zmh.demo.pojo.Call;
import com.zmh.demo.pojo.Log;
import com.zmh.demo.pojo.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class xxService {

    @Autowired
    private xxDao xxDao;

    public List<Call> returncall(){
        return xxDao.returncall();
    }

    public void toscxxs(int room,String message){
        xxDao.toscxxs(room,message);
    }

    public List<UserLog> returnUserrLog(){
        return xxDao.returnUserrLog();
    }

    public List<UserLog> returnUserLogpass(String user){
        return xxDao.returnUserLogpass(user);
    }

    public int countUserLog(){
        return xxDao.countUserLog();
    }

    public List<UserLog> returndownLog(int num){
        return xxDao.returndownLog(num*15);
    }

    public List<UserLog> returndownLogAs(int num,String user){
        return xxDao.returndownLogAs(num*15,user);
    }

    public int countUserLog2(){
        return xxDao.countUserLog2();
    }

    public List<Log> returnLog(){
        return xxDao.returnLog();
    }

    public List<Log> returnUserLogpass2(String status){
        return xxDao.returnUserLogpass2(status);
    }

    public List<Log> returndownLog2(int num){
        return xxDao.returndownLog2(num*15);
    }

    public List<Log> returndownLogAs2(int num,String status){
        return xxDao.returndownLogAs2(num*15,status);
    }
}

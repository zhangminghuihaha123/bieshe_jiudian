package com.zmh.demo.service;

import com.zmh.demo.dao.zhuceDao;
import com.zmh.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ZhuceService {

    @Autowired
    private zhuceDao zhuceDao;


    public void zhuceUser(User user){
        zhuceDao.zhuceUser(user);
    }

}

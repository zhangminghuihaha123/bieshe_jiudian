package com.zmh.demo.service;

import com.zmh.demo.dao.LogDao;
import com.zmh.demo.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    private LogDao logDao;

    public void logInit(Log log){
        logDao.LogInit(log);
    }

}

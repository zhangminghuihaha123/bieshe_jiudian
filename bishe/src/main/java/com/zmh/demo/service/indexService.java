package com.zmh.demo.service;

import com.zmh.demo.dao.indexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class indexService {

    @Autowired
    private indexDao indexDao;


    public String index_panduan_password(String name){
        return indexDao.index_panduan_password(name);
    }

    public int returnLonsmm(Long phone){
        return indexDao.returnLonsmm(phone);
    }

    public void intoupdatename(Long phone,String name,String password){
        indexDao.intoupdatename(phone, name, password);
    }
}

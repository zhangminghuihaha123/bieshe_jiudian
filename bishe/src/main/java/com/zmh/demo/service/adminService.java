package com.zmh.demo.service;

import com.zmh.demo.dao.adminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class adminService {

    @Autowired
    private adminDao adminDao;

    public String admin_panduan_password(String name){
        return adminDao.admin_panduan_password(name);
    }
}

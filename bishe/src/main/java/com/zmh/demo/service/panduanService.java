package com.zmh.demo.service;

import com.zmh.demo.dao.panduandao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class panduanService {

    @Autowired
    private panduandao panduandao;

    public List returnUserList_name(){
        return panduandao.returnUserList_name();
    }

    public List returnAdminList_name(){
        return panduandao.returnAdminList_name();
    }

}

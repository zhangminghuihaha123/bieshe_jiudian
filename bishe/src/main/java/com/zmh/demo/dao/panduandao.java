package com.zmh.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface panduandao {

    public List returnUserList_name();

    public List returnAdminList_name();
}

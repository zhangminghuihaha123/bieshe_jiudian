package com.zmh.demo.dao;

import com.zmh.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface zhuceDao {

    public void zhuceUser(User user);

}

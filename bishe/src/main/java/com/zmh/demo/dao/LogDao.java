package com.zmh.demo.dao;

import com.zmh.demo.pojo.Log;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LogDao {

    public void LogInit(Log log);

}

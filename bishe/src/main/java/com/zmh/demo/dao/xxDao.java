package com.zmh.demo.dao;

import com.zmh.demo.pojo.Call;
import com.zmh.demo.pojo.Log;
import com.zmh.demo.pojo.UserLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface xxDao {

    public List<Call> returncall();

    public void toscxxs(@Param("room") int room,@Param("message") String message);

    public List<UserLog> returnUserrLog();

    public List<UserLog> returnUserLogpass(@Param("user") String user);

    public int countUserLog();

    public List<UserLog> returndownLog(@Param("num") int num);

    public List<UserLog> returndownLogAs(@Param("num") int num,@Param("user") String user);

    public int countUserLog2();

    public List<Log> returnLog();

    public List<Log> returnUserLogpass2(String status);

    public List<Log> returndownLog2(@Param("num") int num);

    public List<Log> returndownLogAs2(@Param("num") int num,@Param("status") String status);
}

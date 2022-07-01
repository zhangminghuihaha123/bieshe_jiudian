package com.zmh.demo.dao;

import com.zmh.demo.pojo.ListE;
import com.zmh.demo.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface plxxDao {

    public List<Room> retunRooms(String user);

    public void tocents(@Param("user") String user,@Param("rooms") String rooms,@Param("call") String call);

    public String getPlxxOk(String user);

}

package com.zmh.demo.dao;

import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Friends;
import com.zmh.demo.pojo.Rooms;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface qtyyDao {

    public void setroomStyle(Rooms rooms);

    public void updateroomStyle(String path,String roomstyle);

    public List<String> returnroomstyle();

    public void setfoodStyle(Foods foods);

    public List<String> returnfoodstyle();

    public void updatefoodStyle(String path,String foodstyle);

    public List<String> returnfiendsstyle();

    public void setfriendStyle(Friends friends);

    public void deletefriends(String friendname);

    public int returnUserCallNum();
}

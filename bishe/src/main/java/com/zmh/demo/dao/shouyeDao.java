package com.zmh.demo.dao;

import com.zmh.demo.pojo.Friends;
import com.zmh.demo.pojo.ListE;
import com.zmh.demo.pojo.ListRoomSalf;
import com.zmh.demo.pojo.Money;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface shouyeDao {

    public void inuserimages(String name,String userimg);

    public String getUserImage(String name);

    public List<ListRoomSalf> returnSalf();

    public List<String> getRoomStyle();

    public List<Friends> returnfriends();

    public ListRoomSalf returnRoomSalf(String roomstyle);

    public List<String> returnzh();

    public String retrunmm(String yhk);

    public int yhktotal(String yhk);

    public int roomsale(String roomstyle);

    public void updateRooms(@Param("user") String user,@Param("start") Date start,@Param("end") Date end,@Param("roomnum") int roomnum,@Param("yhk") String yhk);

    public int returnRoomNum(String roomstyle);

    public void updateMoney(@Param("yhk") String yhk,@Param("cost") int cost);

    public void logUser(@Param("username") String username,@Param("roomnum") int roomnum,@Param("cost") int cost,@Param("starttime") Date starttime,@Param("endtime") Date endtime);

    public int returnMoney1();

    public void inMoney1(Money money);

    public List<ListE> getListEs(String roomstyle);
}

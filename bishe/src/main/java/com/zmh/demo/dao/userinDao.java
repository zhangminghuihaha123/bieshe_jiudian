package com.zmh.demo.dao;

import com.zmh.demo.pojo.ListD;
import com.zmh.demo.pojo.Money;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface userinDao {

    public int UserRoomTotal(String user);

    public List<ListD> returnD(String user);

    public void userDeleteOne(@Param("roomnum") int roomnum);

    public String usergetyhk(@Param("roomnum") int roomnum);

    public int gettotal(int roomnum);

    public void updatecard(@Param("yhk") String yhk,@Param("money") int money);

    public void inusercall(@Param("name") String name,@Param("room") int room,@Param("call") String call);

    public String getRoomStyle(int roomnum);

    public int getMoney1();

    public void InMoney1(Money money);
}

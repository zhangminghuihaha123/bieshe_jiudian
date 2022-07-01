package com.zmh.demo.dao;

import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Rooms;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface yxDao {

    public List<Rooms> returnListRooms();

    public List<Foods> returnListFoods();

    public void updateRoomMoney(@Param("room") String room,@Param("money") int money);

    public void updateFoodMoney(@Param("food") String food,@Param("money") int money);
}

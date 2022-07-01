package com.zmh.demo.dao;

import com.zmh.demo.pojo.Call;
import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Money;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface gmspDao {

    public List<Foods> returnFoodList();

    public int returnyhkMoney(String user);

    public int returnFoodMoney(String food);

    public void updateMoneys(@Param("user") String user,@Param("money") int money);

    public void InMoney1(Money money);

    public int GetMoneys();

    public int GetFoodKc(String food);

    public void updateFoodKc(@Param("food") String food,@Param("num") int num);

    public void InsertUserCallFood(Call call);

    public int ReturnRoomsUser(String user);
}

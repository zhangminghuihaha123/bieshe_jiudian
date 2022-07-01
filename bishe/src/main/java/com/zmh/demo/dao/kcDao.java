package com.zmh.demo.dao;

import com.zmh.demo.pojo.FoodKc;
import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Money;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface kcDao {

    public List<Foods> returnfoodlist();

    public int returnNumB(String food);

    public void infoodkc(@Param("food") String food,@Param("num") int num);

    public void updatefoodkc(@Param("food") String food,@Param("num") int num);

    public List<FoodKc> returnFoodKc();

    public List<FoodKc> returngetkcstyle(String food);

    public int returnKcCount();

    public List<FoodKc> getkctouchs(@Param("num") int num);

    public List<String> getfoodstyles();

    public String getFoodImage(String food);

    public int getFoodmoney(String food);

    public void gettosellFood(@Param("food") String food,@Param("num") int num);

    public void InMoneys(Money money);

    public int returnMoneySelf();
}

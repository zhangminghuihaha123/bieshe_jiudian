package com.zmh.demo.dao;

import com.zmh.demo.pojo.Money;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface cwglDao {

    public List<Integer> getRoommoney();

    public List<Integer> getFoodmoney();

    public List<Integer> getzhichus();

    public List<Money> returnMoneys();

    public int returnNums();

    public List<Money> returnNUmMoney(@Param("n") int n);

    public List<Money> getMOneyDay();

    public List<Money> getMOneyAgo();
}

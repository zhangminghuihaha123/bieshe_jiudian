package com.zmh.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface indexDao {
       public String index_panduan_password(String name);

       public int returnLonsmm(Long phone);

       public void intoupdatename(@Param("phone") Long phone,@Param("name") String name,@Param("password") String password);
}

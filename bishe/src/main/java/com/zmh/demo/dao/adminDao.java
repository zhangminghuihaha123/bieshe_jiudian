package com.zmh.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface adminDao {

      public String admin_panduan_password(String name);
}

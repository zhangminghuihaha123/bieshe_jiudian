package com.zmh.demo.dao;

import com.zmh.demo.pojo.ListA;
import com.zmh.demo.pojo.ListB;
import com.zmh.demo.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface fwglDao {

    public void inroom(Room room);

    public String selectroomone();

    public void truncateroom();

    public String returnlistRoom(int roomnum);

    public List<String> returnRoomStyle();

    public void tcxg(@Param("roomnum") int roomnum,@Param("roomstyle") String roomstyle);

    public List<ListA> returnA();

    public ListB returnB(@Param("roomuser") String roomuser,@Param("roomnum") int roomnum);

    public List<Room> returnRoom();

    public void qclj();

    public Room toqqcroom(int roomnum);

    public void toqqcclearroom(int roomnum);

    public List<String> returnRoomsHave();

    public List<Integer>  returnRoomHave(String room);

    public void inzhuce(@Param("name") String name,@Param("sex") char sex,@Param("number") String number,@Param("phone") Long phone);

    public void inruzhu(@Param("user") String user,@Param("start") Date start,@Param("end") Date end,@Param("roomstyle") String roomstyle,@Param("roomnum") int roomnum);
}

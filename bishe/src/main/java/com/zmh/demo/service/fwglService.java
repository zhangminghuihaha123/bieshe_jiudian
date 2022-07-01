package com.zmh.demo.service;

import com.zmh.demo.dao.fwglDao;
import com.zmh.demo.pojo.ListA;
import com.zmh.demo.pojo.ListB;
import com.zmh.demo.pojo.ListE;
import com.zmh.demo.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class fwglService {

    @Autowired
    private fwglDao fwglDao;

    public void inroom(Room room){
        fwglDao.inroom(room);
    }

    public String selectroomone(){
        return fwglDao.selectroomone();
    }

    public void truncateroom(){
        fwglDao.truncateroom();
    }

    public String returnlistRoom(int roomnum){
        return fwglDao.returnlistRoom(roomnum);
    }

    public List<String> returnRoomStyle(){
        return fwglDao.returnRoomStyle();
    }

    public void tcxg(int roomnum,String roomstyle){
        fwglDao.tcxg(roomnum,roomstyle);
    }

    public List<ListA> returnA(){
        return fwglDao.returnA();
    }

    public ListB returnB(String roomuser,int roomnum){
        return fwglDao.returnB(roomuser,roomnum);
    }

    public List<Room> returnRoom(){
        return fwglDao.returnRoom();
    }

    public void qclj(){
        fwglDao.qclj();
    }

    public Room toqqcroom(int roomnum){
        return fwglDao.toqqcroom(roomnum);
    }

    public void toqqcclearroom(int roomnum){
        fwglDao.toqqcclearroom(roomnum);
    }

    public List<String> returnRoomsHave(){
        return fwglDao.returnRoomsHave();
    }

    public List<Integer> returnRoomHave(String room){
        return fwglDao.returnRoomHave(room);
    }

    public void inzhuce(String name,char sex,String number,Long phone){
        fwglDao.inzhuce(name, sex, number, phone);
    }

    public void inruzhu(String user, Date start,Date end,String roomstyle,int roomnum){
        fwglDao.inruzhu(user, start, end, roomstyle, roomnum);
    }
}

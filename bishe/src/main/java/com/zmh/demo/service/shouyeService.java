package com.zmh.demo.service;

import com.zmh.demo.dao.shouyeDao;
import com.zmh.demo.pojo.Friends;
import com.zmh.demo.pojo.ListE;
import com.zmh.demo.pojo.ListRoomSalf;
import com.zmh.demo.pojo.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class shouyeService {

    @Autowired
    private shouyeDao shouyeDao;

    public void inuserimages(String name,String userimg){
        shouyeDao.inuserimages(name,userimg);
    }

    public String getUserImage(String name){
        return shouyeDao.getUserImage(name);
    }

    public List<ListRoomSalf> returnSalf(){
        return shouyeDao.returnSalf();
    }

    public List<String> getRoomStyle(){
        return shouyeDao.getRoomStyle();
    }

    public List<Friends> returnfriends(){
        return shouyeDao.returnfriends();
    }

    public ListRoomSalf returnRoomSalf(String roomstyle){
        return shouyeDao.returnRoomSalf(roomstyle);
    }

    public List<String> returnzh(){
        return shouyeDao.returnzh();
    }

    public  String retrunmm(String yhk){
        return shouyeDao.retrunmm(yhk);
    }

    public int yhktotal(String yhk){
        return shouyeDao.yhktotal(yhk);
    }

    public int roomsale(String roomstyle){
        return shouyeDao.roomsale(roomstyle);
    }

    public int returnRoomNum(String roomstyle){
        return shouyeDao.returnRoomNum(roomstyle);
    }

    public void updateRooms(String user, Date start,Date end, int roomnum,String yhk){
        shouyeDao.updateRooms(user,start,end,roomnum,yhk);
    }

    public void updateMoney(String yhk,int cost){
        shouyeDao.updateMoney(yhk,cost);
    }

    public void logUser(String username,int roomnum,int cost,Date starttime,Date endtime){
        shouyeDao.logUser(username, roomnum, cost, starttime, endtime);
    }

    public int returnMoney1(){
        return  shouyeDao.returnMoney1();
    }

    public void inMoney1(Money money){
        shouyeDao.inMoney1(money);
    }

    public List<ListE> getListEs(String roomstyle){
        return shouyeDao.getListEs(roomstyle);
    }
}

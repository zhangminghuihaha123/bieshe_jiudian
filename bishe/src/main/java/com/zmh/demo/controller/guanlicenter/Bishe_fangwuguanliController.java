package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.pojo.ListB;
import com.zmh.demo.pojo.Log;
import com.zmh.demo.pojo.Money;
import com.zmh.demo.pojo.Room;
import com.zmh.demo.service.LogService;
import com.zmh.demo.service.fwglService;
import com.zmh.demo.service.shouyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Bishe_fangwuguanliController {

    @Autowired
    private fwglService fwglService;

    @Autowired
    private shouyeService shouyeService;

    @PostMapping("/fangjianpeizhi")
    public String fangjianpeizhi(String lx01,String lx02,String lx03,String lx04,String lx05,String lx06,String lx07,String lx08,String lx09,String lx10,
                               String lx11,String lx12,String lx13,String lx14,String lx15,String lx16,String lx17,String lx18,String lx19,String lx20,
                               String lx21,String lx22,String lx23,String lx24,String lx25,String lx26,String lx27,String lx28,String lx29,String lx30,
                               String lx31,String lx32,String lx33,String lx34,String lx35,String lx36,String lx37,String lx38,String lx39,String lx40
                               ){
        String message="";
        if(fwglService.selectroomone()!=null){
            message="不能录入，原因已有数据,您可以选择清空数据";
        }else {
            fwglService.inroom(new Room(101,lx01));fwglService.inroom(new Room(102,lx02));fwglService.inroom(new Room(103,lx03));fwglService.inroom(new Room(104,lx04));fwglService.inroom(new Room(105,lx05));
            fwglService.inroom(new Room(106,lx06));fwglService.inroom(new Room(107,lx07));fwglService.inroom(new Room(108,lx08));fwglService.inroom(new Room(109,lx09));fwglService.inroom(new Room(110,lx10));
            fwglService.inroom(new Room(201,lx11));fwglService.inroom(new Room(202,lx12));fwglService.inroom(new Room(203,lx13));fwglService.inroom(new Room(204,lx14));fwglService.inroom(new Room(205,lx15));
            fwglService.inroom(new Room(206,lx16));fwglService.inroom(new Room(207,lx17));fwglService.inroom(new Room(208,lx18));fwglService.inroom(new Room(209,lx19));fwglService.inroom(new Room(210,lx20));
            fwglService.inroom(new Room(301,lx21));fwglService.inroom(new Room(302,lx22));fwglService.inroom(new Room(303,lx23));fwglService.inroom(new Room(304,lx24));fwglService.inroom(new Room(305,lx25));
            fwglService.inroom(new Room(306,lx26));fwglService.inroom(new Room(307,lx27));fwglService.inroom(new Room(308,lx28));fwglService.inroom(new Room(309,lx29));fwglService.inroom(new Room(310,lx30));
            fwglService.inroom(new Room(401,lx31));fwglService.inroom(new Room(402,lx32));fwglService.inroom(new Room(403,lx33));fwglService.inroom(new Room(404,lx34));fwglService.inroom(new Room(405,lx35));
            fwglService.inroom(new Room(406,lx36));fwglService.inroom(new Room(407,lx37));fwglService.inroom(new Room(408,lx38));fwglService.inroom(new Room(409,lx39));fwglService.inroom(new Room(410,lx40));
            message="录入成功!";
        }
        return message;
    }

    @PostMapping("/qingkongshuju")
    public void qingkongshuju(){
       fwglService.truncateroom();
    }

    @PostMapping("/tcxg")
    public void tcxg(int roomnum,String roomstyle){
       fwglService.tcxg(roomnum,roomstyle);
    }

    @PostMapping("/getum")
    public List getum(String user, String room){
        List list=new ArrayList();
        ListB listB=fwglService.returnB(user,Integer.valueOf(room));
        list.add(listB.getRoomuser());
        list.add(listB.getRoomnum());
        list.add(listB.getAge());
        list.add(listB.getPhonenumber());
        list.add(listB.getStarttime());
        list.add(listB.getEndtime());
        return list;
    }

    @PostMapping("/qqc")
    public void qqc(){
        fwglService.qclj();
    }

    @PostMapping("/toqqc")
    public List toqqc(String roomnum){
        List list=new ArrayList();
        Room room=fwglService.toqqcroom(Integer.valueOf(roomnum));
        list.add(room.getRoomnum());
        list.add(room.getRoomuser());
        list.add(room.getEndtime());
        return list;
    }

    @PostMapping("/toqqcclear")
    public void toqqcclear(String roomnum){
        fwglService.toqqcclearroom(Integer.valueOf(roomnum));
    }


    @PostMapping("/tohuoqua")
    public List<Integer> tohuoqua(String room){
        return fwglService.returnRoomHave(room);
    }


    @PostMapping("/toinRooms")
    public void toinRooms(String name, Character sex, String number, int room, Long phone, String roomstyle, String start,String end){
        fwglService.inzhuce(name,sex,number,phone);
        try {
            long m = 0;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            m = sdf.parse(end).getTime() - sdf.parse(start).getTime();
            int times;
            if((int)(m/(1000 * 60 * 60 * 24))==0){
                times=1;
            }else {
                times=(int)(m/(1000 * 60 * 60 * 24));
            }
            int cost=shouyeService.roomsale(roomstyle) * times;
            end=end+" 00:00:00";
            Date date1 = sdf.parse(start);
            Date date2 = sdf.parse(end);
            fwglService.inruzhu(name,date1,date2,roomstyle,room);
            shouyeService.logUser(name,room,cost,date1,date2);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            Date timess=null;
            int moneys=shouyeService.returnMoney1();
            try {
                timess=simpleDateFormat.parse(time);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            shouyeService.inMoney1(new Money(moneys+cost,timess,roomstyle,cost));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

package com.zmh.demo.controller.bishe_user_in;

import com.zmh.demo.pojo.Money;
import com.zmh.demo.service.userinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserInController {

    @Autowired
    private userinService userinService;

    @PostMapping("/th01")
    public void th01(String roomnum, Date starttime,String roomuser){
        String yhk=userinService.usergetyhk(Integer.valueOf(roomnum));
        int cost=userinService.gettotal(Integer.valueOf(roomnum));
        userinService.updatecard(yhk,cost);
        userinService.userDeleteOne(Integer.valueOf(roomnum));

        String roomstyle=userinService.getRoomStyle(Integer.valueOf(roomnum));
        int money=userinService.getMoney1();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        Date timess=null;
        try {
            timess=simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        userinService.InMoney1(new Money(money-cost,timess,roomstyle,-cost));
    }

    @PostMapping("/tousercall")
    public void tousercall(String name,String room,String call){
        userinService.inusercall(name,Integer.valueOf(room),call);
    }

}

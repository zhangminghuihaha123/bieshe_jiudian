package com.zmh.demo.controller.bishe_user_in;

import com.zmh.demo.pojo.Call;
import com.zmh.demo.pojo.Money;
import com.zmh.demo.service.gmspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class gmspController {

    @Autowired
    private gmspService gmspService;

    @PostMapping("/toPayFood")
    public String toPayFood(String user,String food,int num){
        String message="支付失败！余额不足";
        int yhkmoney=gmspService.returnyhkMoney(user);
        int peaice=gmspService.returnFoodMoney(food)*num;
        int number=gmspService.GetFoodKc(food);
        if(number>=num){
            if(yhkmoney>=peaice){
                message="支付成功!";
                gmspService.updateMoneys(user,yhkmoney-peaice);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                int moneys=gmspService.GetMoneys();
                Date timess=null;
                try {
                    timess=simpleDateFormat.parse(time);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                gmspService.InMoney1(new Money(moneys+peaice,timess,food,peaice));
                gmspService.updateFoodKc(food,num);
                int rooms=gmspService.ReturnRoomsUser(user);
                gmspService.InsertUserCallFood(new Call(user,rooms,user+"用户购买了"+food+num+"个"));
            }
        }else {
            message="无法购买，库存不足";
        }
        return message;
    }
}

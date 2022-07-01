package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.pojo.FoodKc;
import com.zmh.demo.pojo.Money;
import com.zmh.demo.service.kcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Bishe_kcController {

    @Autowired
    private kcService kcService;

    @PostMapping("/kcin")
    public void kcin(String food,int num){
       int n=kcService.returnNumB(food);
       if(n>0){
           kcService.updatefoodkc(food, num);
       }else {
           kcService.infoodkc(food, num);
       }

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        int peaice=kcService.getFoodmoney(food);
        Date times=null;
        try {
            times=simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int moneys=kcService.returnMoneySelf()-num*peaice/2;
        kcService.InMoneys(new Money(moneys,times,food,-num*peaice/2));
    }

    @PostMapping("/getkcstyle")
    public List<FoodKc> getkcstyle(String food){
        return kcService.returngetkcstyle(food);
    }

   @PostMapping("/kctouchs")
   public List<FoodKc> kctouchs(int num){
        return kcService.getkctouchs(num);
   }

   @PostMapping("/getfoodimg")
   public String getfoodimg(String food){
      return kcService.getFoodImage(food);
   }

    @PostMapping("/getfoodmoney")
    public int getfoodmoney(String food){
        return kcService.getFoodmoney(food);
    }

    @PostMapping("/tosellFood")
    public void tosellFood(String food,int num){
        kcService.gettosellFood(food, num);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        int peaice=kcService.getFoodmoney(food);
        Date times=null;
        try {
            times=simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int moneys=kcService.returnMoneySelf()+num*peaice;
        kcService.InMoneys(new Money(moneys,times,food,num*peaice));
    }

}

package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.service.yxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bishe_yxglController {

    @Autowired
    private yxService yxService;

    @PostMapping("/xiugairoom")
    public void xiugairoom(String room,int money){
        yxService.updateRoomMoney(room, money);
    }

    @PostMapping("/xiugaifood")
    public void xiugaifood(String food,int money){
        yxService.updateFoodMoney(food, money);
    }


}


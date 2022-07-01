package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.pojo.Log;
import com.zmh.demo.pojo.UserLog;
import com.zmh.demo.service.xxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Bishe_xxController {

    private static int up=0;
    private static int down=0;

    @Autowired
    private xxService xxService;


    @PostMapping("/toscxx")
    public void toscxx(String room,String message){
        xxService.toscxxs(Integer.valueOf(room),message);
    }

    @PostMapping("/xxys")
    public List<UserLog> xxys(String user){
        return xxService.returnUserLogpass(user);
    }

    @PostMapping("/xxys2")
    public List<Log> xxys2(String status){
        return xxService.returnUserLogpass2(status);
    }

    @PostMapping("/xxysdown")
    public List<UserLog> xxysdown(int num,String user){
        if(user.equals("") || user==null){
            return xxService.returndownLog(num);
        }else {
            return xxService.returndownLogAs(num, user);
        }
    }

    @PostMapping("/xxysup")
    public List<UserLog> xxysup(int num,String user){
        if(user.equals("") || user==null){
            return xxService.returndownLog(num);
        }else {
            return xxService.returndownLogAs(num, user);
        }
    }

    @PostMapping("/xxysdown2")
    public List<Log> xxysdown2(int num,String status){
        if(status.equals("") || status==null){
            return xxService.returndownLog2(num);
        }else {
            return xxService.returndownLogAs2(num, status);
        }
    }

    @PostMapping("/xxysup2")
    public List<Log> xxysup2(int num,String status){
        if(status.equals("") || status==null){
            return xxService.returndownLog2(num);
        }else {
            return xxService.returndownLogAs2(num, status);
        }
    }

}

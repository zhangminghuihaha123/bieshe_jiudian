package com.zmh.demo.controller.bishe_user;

import com.zmh.demo.pojo.User;
import com.zmh.demo.service.ZhuceService;
import com.zmh.demo.util.RedisUtil;
import com.zmh.demo.util.returns.returnUserList_name;
import com.zmh.demo.util.yzm_suijima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
public class ZhuceController {

    //存在一样的name返回false，不一样就为true
    @Autowired
    private returnUserList_name returnUserList_name;

    @Autowired
    private yzm_suijima yzm_suijima;

    @Autowired
    private ZhuceService zhuceService;

    private String yzm_string;

    @Autowired
    private RedisUtil redisUtil;


    @PostMapping("/scyzm")
    public String scyzm() {
        yzm_string=yzm_suijima.message();
        if(redisUtil.hasKey("key"))
        {
            redisUtil.del("key");
            redisUtil.set("key",yzm_string);
            redisUtil.expire("key",120, TimeUnit.SECONDS);
        }
        else
        {
            redisUtil.set("key",yzm_string);
            redisUtil.expire("key",120, TimeUnit.SECONDS);
        }
        return yzm_string;
    }


    @PostMapping("/tozhuce")
    public String tozhuce(String password, String name, char sex, String age, long phonenumber, String yzm) {
        String message="";
        if((redisUtil.get("key")).equals(yzm)) {
            if (!name.equals("") && !password.equals("") && age != null && phonenumber != 0) {
                if(returnUserList_name.panduan(name)){
                    message="注册成功！";
                    zhuceService.zhuceUser(new User(0, password, name, new Date(System.currentTimeMillis()), sex, age, phonenumber));
                }else {
                    message="用户名已占用！请换一个用户名!";
                }
            }else{
                message="你的表单有空项！";
            }
        }else {
            message="您的验证码有误或者超过时间!";
        }
        return message;
    }


    @PostMapping("/zhucereturnname")
    public String panduan_name(String name) {
        String message = "";
        if(name.equals("")){
            message="不能为空!";
        }else {
            if (returnUserList_name.panduan(name)) {
                message = "可以注册!";
            } else {
                message = "用户已存在!";
            }
        }
        return message;
    }

}

package com.zmh.demo.controller.bishe_user;

import com.zmh.demo.service.indexService;
import com.zmh.demo.util.returns.returnUserList_name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private indexService indexService;

    //存在一样的name返回false，不一样就为true
    @Autowired
    private returnUserList_name returnUserList_name;


   @PostMapping("/index_panduan_name")
   public String index_panduan_name(String name){
       String message="";
       if(name.equals("")){
           message="不能为空!";
       }else {
           if(returnUserList_name.panduan(name)){
               message="用户名不存在!";
           }else {
               message="用户名存在!";
           }
       }
       return message;
   }

   @PostMapping("/index_panduan_password")
   public String index_panduan_password(String name,String password){
       String message="";
       if(name.equals("")){
           message="用户名不能为空!";
       }else {
           if(returnUserList_name.panduan(name)){
               message="用户名不存在!";
           }else {
               if(password.equals("")){
                   message="密码不能为空！";
               }else {
                   if(indexService.index_panduan_password(name).equals(password)){
                       message="密码正确！";
                   }else {
                       message="密码错误！";
                   }
               }
           }
       }
       return message;
   }

   @PostMapping("/index_panding")
   public String index_panding(String name, String password, HttpSession session){
       String message="";
       if(name.equals("")){
           message="用户名不能为空!";
       }else {
           if(password.equals("")){
               message="密码不能为空！";
           }else {
               if(returnUserList_name.panduan(name)){
                   message="用户名不存在!";
               }else {
                   if(indexService.index_panduan_password(name).equals(password)){
                       message="登录成功！";
                       session.setAttribute("key",name);
                   }else {
                       message="密码错误！";
                   }
               }
           }
       }
       return message;
   }

   @PostMapping("/zhmm1")
   public String zhmm1(String phone){
       long phones=Long.valueOf(phone);
       String message="";
       int count=indexService.returnLonsmm(phones);
       if(count>0){
           message="成功";
       }else {
           message="失败";
       }
       return message;
   }


    @PostMapping("/zhmm2")
    public void zhmm2(String phone,String name,String password){
        long phones=Long.valueOf(phone);
        indexService.intoupdatename(phones,name,password);
    }
}

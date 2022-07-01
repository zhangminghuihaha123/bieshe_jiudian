package com.zmh.demo.controller.bishe_admin;

import com.zmh.demo.service.adminService;
import com.zmh.demo.util.returns.returnAdminList_name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class adminController {

    @Autowired
    private adminService adminService;

    //存在一样的name返回false，不一样就为true
    @Autowired
    private returnAdminList_name returnAdminList_name;

    @PostMapping("/Admin_panduan")
    public String Admin_panduan(String name, String password, HttpSession session){
        String message="";
        if(name.equals("")){
            message="用户名为空!";
        }else {
            if (password.equals("")){
                message="密码为空!";
            }else
            {
                if(returnAdminList_name.panduan(name)){
                    message="用户不存在!";
                }else {
                   if (adminService.admin_panduan_password(name).equals(password)){
                       session.setAttribute("key","admin");
                       message="恭喜你！登陆成功!";
                   }else {
                       message="密码错误!";
                   }
                }
            }
        }
        return message;
    }

    @PostMapping("/Admin_panduan_name")
    public String Admin_panduan_name(String name){
        String message="";
        if(name.equals("")){
            message="用户名不能为空！";
        }else {
            if (returnAdminList_name.panduan(name)) {
                message = "用户名不存在！";
            } else {
                message = "用户名正确！";
            }
        }
        return message;
    }

    @PostMapping("/Admin_panduan_password")
    public String Admin_panduan_password(String name,String password){
        String message="";
        if(name.equals("")){
            message="用户名为空!";
        }else {
            if (password.equals("")){
                message="密码为空!";
            }else
            {
                if(returnAdminList_name.panduan(name)){
                    message="用户名不存在!";
                }else {
                    if (adminService.admin_panduan_password(name).equals(password)){
                        message="密码正确!";
                    }else {
                        message="密码错误!";
                    }
                }
            }
        }
        return message;
    }
}

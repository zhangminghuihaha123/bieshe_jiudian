package com.zmh.demo.controller.bishe_user_in;

import com.zmh.demo.service.gmspService;
import com.zmh.demo.service.plxxService;
import com.zmh.demo.service.shouyeService;
import com.zmh.demo.service.userinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Controller
public class Bishe_userin_Controller {

    private String roomstyle;
    private String user;
    private String start;
    private String end;

    @Autowired
    private shouyeService shouyeService;

    @Autowired
    private userinService userinService;

    @Autowired
    private gmspService gmspService;

    @Autowired
    private plxxService plxxService;

    @GetMapping("/shouye")
    public ModelAndView toshouye(HttpServletRequest request, HashMap map){
        try {
            String username=(String) request.getSession().getAttribute("key");
            map.put("users","欢迎当前用户:"+username);
            if(shouyeService.getUserImage(username)!=null){
                map.put("imgs",shouyeService.getUserImage(username));
            }else {
                map.put("imgs","../static/img/shouye/g.png");
            }
            map.put("fjzy",shouyeService.returnSalf());
            map.put("frs",shouyeService.returnfriends());
            request.setAttribute("status",1);
            return new ModelAndView("shouye");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }


    @PostMapping("/usertobuy")
    @ResponseBody
    public void usertobuy(String roomstyle, String user, String start,String end){ ;
        this.roomstyle=roomstyle;
        this.user=user;
        this.start=start;
        this.end=end;
    }

    @GetMapping("/userinbuy")
    public ModelAndView userinbuy(HashMap map,HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            map.put("users",this.user);
            map.put("start",this.start);
            map.put("roomstyle",this.roomstyle);
            map.put("end",this.end);
            map.put("rooms",shouyeService.returnRoomSalf(this.roomstyle));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            long m = sdf.parse(end).getTime() - sdf.parse(start).getTime();
            int times;
            if((int)(m/(1000 * 60 * 60 * 24))==0){
                times=1;
            }else {
                times=(int)(m/(1000 * 60 * 60 * 24));
            }
            map.put("times",times);
            map.put("ms",shouyeService.getListEs(this.roomstyle));
            return new ModelAndView("goumaiye");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }

    @GetMapping("/qtfw")
    public ModelAndView qtfw(HashMap map, HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            String name= (String) request.getSession().getAttribute("names");
            map.put("user",name);
            map.put("num",userinService.UserRoomTotal(name));
            map.put("xx",userinService.returnD(name));
            return new ModelAndView("userin");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }


    @GetMapping("/gmsp")
   public ModelAndView gmsp(HashMap map,HttpServletRequest request){

        try {
            request.setAttribute("status",1);
            String name= (String) request.getSession().getAttribute("names");
            map.put("user",name);
            map.put("fodl",gmspService.returnFoodList());
            map.put("size",gmspService.returnFoodList().size());
            return new ModelAndView("goumaishangping");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
   }

   @GetMapping("/lypl")
   public ModelAndView lypl(HashMap map,HttpServletRequest request){
       try {
           request.setAttribute("status",1);
           String name= (String) request.getSession().getAttribute("names");
           map.put("user",name);
           map.put("room",plxxService.retunRooms(name));
           return new ModelAndView("liuyanpinglun");
       }catch (Exception e){
           request.setAttribute("status",2);
           return new ModelAndView("404");
       }
   }

}

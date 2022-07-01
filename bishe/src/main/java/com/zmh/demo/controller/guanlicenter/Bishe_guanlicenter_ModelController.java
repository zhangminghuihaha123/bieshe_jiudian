package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.pojo.ListA;
import com.zmh.demo.pojo.ListC;
import com.zmh.demo.pojo.Room;
import com.zmh.demo.service.*;
import com.zmh.demo.util.returns.ReturnListRoom;
import io.lettuce.core.ScriptOutputType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class Bishe_guanlicenter_ModelController {

    @Autowired
    private qtyyService qtyyService;

    @Autowired
    private ReturnListRoom returnListRoom;

    @Autowired
    private fwglService fwglService;

    @Autowired
    private xxService xxService;

    @Autowired
    private kcService kcService;

    @Autowired
    private yxService yxService;

    @Autowired
    private cwglService cwglService;

    @GetMapping("/guanlicenter_index")
    public String guanlicenter_index(HttpServletRequest request, HashMap map, HttpSession session){

        try {
            request.setAttribute("status",1);
            map.put("admins",session.getAttribute("key"));
            map.put("number",qtyyService.returnUserCallNum());
            return "guanli_center";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

    @GetMapping("/qiantaiyingye")
    public String qiantaiyingye(HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            return "qiantaiyingye";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

    @GetMapping("/fangwuguanli")
    public String fangwuguanli(HttpServletRequest request,HashMap map){
        try {
            request.setAttribute("status",1);
            List<String> list=qtyyService.returnroomstyle();
            map.put("fjlx",list);
            map.put("fxsl",list.size());
            map.put("fjxx",returnListRoom.ReturnListRoom());
            map.put("fj01",fwglService.returnRoomStyle());
            List<ListC> list1=new ArrayList();
            List list2=fwglService.returnRoom();
            for(int j=0;j<list2.size();j++){
                String name=((Room)(list2.get(j))).getRoomuser();
                int roomnum=((Room)(list2.get(j))).getRoomnum();
                Date time=((Room)(list2.get(j))).getEndtime();
                Date times=new Date();
                String status="";
                if(time.before(times)){
                    status="到期";
                }else {
                    status="未到期";
                }
                list1.add(new ListC(name,roomnum,time,status));
            }
            map.put("tfxx",list1);
            map.put("rz01",fwglService.returnRoomsHave());
            return "fangwuguanli";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

    @PostMapping("/goumaixinxi")
    @ResponseBody
    public List goumaixinxi(){
        List list1=fwglService.returnA();
        List list2=new ArrayList();
        for(int i=0;i<list1.size();i++){
            list2.add(((ListA)(list1.get(i))).getRoomnum());
            list2.add(((ListA)(list1.get(i))).getRoomuser());
        }
        return list2;
    }


    @GetMapping("/xxy")
    public String xxy(String user,HashMap map,HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            map.put("usermessage",xxService.returncall());
            map.put("userlog", xxService.returnUserrLog());
            int number1=0;
            if((xxService.countUserLog())%15==0){
                number1=xxService.countUserLog()/15;
            }else {
                number1=xxService.countUserLog()/15+1;
            }
            map.put("number1",number1);
            map.put("log", xxService.returnLog());
            int number2=0;
            if((xxService.countUserLog2())%15==0){
                number2=xxService.countUserLog2()/15;
            }else {
                number2=xxService.countUserLog2()/15+1;
            }
            map.put("number2",number2);
            return "xx";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

    @GetMapping("/kcgls")
    public String kcgls(HashMap map,HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            map.put("foodslist",kcService.returnfoodlist());
            map.put("foodkclist",kcService.returnFoodKc());
            int num=kcService.returnKcCount();
            if(num%15==0){
                num=num/15;
            }else {
                num=num/15+1;
            }
            map.put("kccount",num);
            map.put("kcfoods",kcService.getfoodstyles());
            return "kcgl";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

    @GetMapping("/yxgl")
    public String yxgl(HashMap map,HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            map.put("fja",yxService.returnListRooms());
            map.put("wpa",yxService.returnListFoods());
            map.put("wpnum",yxService.returnListFoods().size());
            map.put("fjnum",yxService.returnListRooms().size());
            return "yingxiaoguanli";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }


    @GetMapping("/cwgl")
    public String cwgl(HashMap map,HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            map.put("mapMoney",cwglService.returnMoneys());
            map.put("nums",cwglService.returnNums());
            return "caiwuguanli";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

    @GetMapping("/fwdh")
    public String fwdh(HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            return "fwdh";
        }catch (Exception e){
            request.setAttribute("status",2);
            return "404";
        }
    }

}

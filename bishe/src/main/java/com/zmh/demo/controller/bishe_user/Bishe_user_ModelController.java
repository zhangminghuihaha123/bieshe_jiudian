package com.zmh.demo.controller.bishe_user;

import com.zmh.demo.service.ZhuceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Bishe_user_ModelController {


    @GetMapping("/index")
    public ModelAndView toindex(HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            return new ModelAndView("index");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }

    @GetMapping("/zhuce")
    public ModelAndView tozhuce(HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            return new ModelAndView("zhuce");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }

    @GetMapping("/404")
    public ModelAndView to404(){
        return new ModelAndView("404");
    }

    @GetMapping("/success")
    public ModelAndView tosuccess(HttpServletRequest request){
        try {
            request.setAttribute("status",1);
            return new ModelAndView("success");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }

    @GetMapping("/guanyuwomen")
    public ModelAndView toguanyuwomen(HttpServletRequest request)
    {
        try {
            request.setAttribute("status",1);
            return new ModelAndView("guanyuwomen");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }

    @GetMapping("/wmm")
    public ModelAndView wmm(HttpServletRequest request)
    {
        try {
            request.setAttribute("status",1);
            return new ModelAndView("wjmm");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }


}

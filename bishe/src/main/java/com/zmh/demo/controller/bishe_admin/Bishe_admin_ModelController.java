package com.zmh.demo.controller.bishe_admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Bishe_admin_ModelController {

    @GetMapping("/guanliyuan_denglu")
    public ModelAndView touanliyuan_denglu(HttpServletRequest request)
    {
        try {
            request.setAttribute("status",1);
            return new ModelAndView("guanliyuan_denglu");
        }catch (Exception e){
            request.setAttribute("status",2);
            return new ModelAndView("404");
        }
    }


}

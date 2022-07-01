package com.zmh.demo.controller.bishe_user_in;

import com.zmh.demo.service.plxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class plxxController {

    @Autowired
    private plxxService plxxService;

   @PostMapping("/tolyx")
   public void tolyx(String user,String rooms,String call){
       if(call!=null||(!call.equals(""))){
            plxxService.tocents(user, rooms, call);
       }
   }

   @PostMapping("/getRoomsArd")
   public String getRoomsArd(String user){
        return plxxService.getPlxxOk(user);
   }
}

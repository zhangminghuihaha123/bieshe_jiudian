package com.zmh.demo.util.returns;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class returnRoomsList {

    /*如果不存在一样的，返回true，否则false*/
    public boolean returnroomslist(List<String> list,String roomstyle){
        boolean b=true;
        for(String rooms : list){
            if(rooms.equals(roomstyle)){
                b=false;
                break;
            }
        }
        return b;
    }
}

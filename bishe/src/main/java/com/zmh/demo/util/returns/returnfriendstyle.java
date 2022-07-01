package com.zmh.demo.util.returns;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class returnfriendstyle {

    /*如果不存在一样的，返回true，否则false*/
    public boolean returnfriendslist(List<String> list, String friendstyle){
        boolean b=true;
        for(String rooms : list){
            if(rooms.equals(friendstyle)){
                b=false;
                break;
            }
        }
        return b;
    }
}

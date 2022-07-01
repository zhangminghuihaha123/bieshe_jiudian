package com.zmh.demo.util.returns;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class returnCard {

    /*如果不存在一样的，返回true，否则false*/
    public boolean returnCard(List<String> list, String card){
        boolean b=true;
        for(String rooms : list){
            if(rooms.equals(card)){
                b=false;
                break;
            }
        }
        return b;
    }
}

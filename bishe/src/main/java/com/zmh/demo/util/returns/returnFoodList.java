package com.zmh.demo.util.returns;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class returnFoodList {

    /*如果不存在一样的，返回true，否则false*/
    public boolean returnfoodslist(List<String> list, String foodstyle){
        boolean b=true;
        for(String rooms : list){
            if(rooms.equals(foodstyle)){
                b=false;
                break;
            }
        }
        return b;
    }
}

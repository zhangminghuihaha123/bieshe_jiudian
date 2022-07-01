package com.zmh.demo.util;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetImgName {

    public StringBuilder returnStringBuilder(String noPath){
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars=noPath.toCharArray();
        List list=new ArrayList();
        for(int i=chars.length-1;i>0;i--){
            if(chars[i]=='\\'||chars[i]=='/') {
                break;
            }else {
                list.add(chars[i]);
            }
        }
        for(int j=list.size()-1;j>=0;j--){
            stringBuilder.append(list.get(j));
        }
        return stringBuilder;
    }
}


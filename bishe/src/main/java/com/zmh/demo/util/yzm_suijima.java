package com.zmh.demo.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class yzm_suijima {

    public String message(){
    StringBuilder stringBuilder=new StringBuilder();
    char[] chars={'0','1','2','3','4','5','6','7','8','9','q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
    for(int i=0;i<4;i++){
        stringBuilder.append(chars[(int) (Math.random()*62)]);
    }
    return stringBuilder.toString();
    }
}

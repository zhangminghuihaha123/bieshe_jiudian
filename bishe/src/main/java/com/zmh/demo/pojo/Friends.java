package com.zmh.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Friends {
    private String friendimg;
    private String friendname;
    private int friendmoney;

    public Friends(String friendimg, String friendname, int friendmoney) {
        this.friendimg = friendimg;
        this.friendname = friendname;
        this.friendmoney = friendmoney;
    }
}

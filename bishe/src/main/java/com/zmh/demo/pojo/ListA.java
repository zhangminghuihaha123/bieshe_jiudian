package com.zmh.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ListA {

    private int roomnum;
    private String roomuser;

    public ListA(int roomnum, String roomuser) {
        this.roomnum = roomnum;
        this.roomuser = roomuser;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public String getRoomuser() {
        return roomuser;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public void setRoomuser(String roomuser) {
        this.roomuser = roomuser;
    }


}

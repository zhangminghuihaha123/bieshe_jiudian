package com.zmh.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Rooms {
    private String roomstyle;
    private int money;
    private String roomimg;

    public Rooms(String roomstyle, int money, String roomimg) {
        this.roomstyle = roomstyle;
        this.money = money;
        this.roomimg = roomimg;
    }

    public String getRoomstyle() {
        return roomstyle;
    }

    public void setRoomstyle(String roomstyle) {
        this.roomstyle = roomstyle;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getRoomimg() {
        return roomimg;
    }

    public void setRoomimg(String roomimg) {
        this.roomimg = roomimg;
    }
}

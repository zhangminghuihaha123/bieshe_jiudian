package com.zmh.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ListRoomSalf {

    private int id;
    private String roomimg;
    private String roomstyle;
    private int money;
    private int roomtotal;

    public ListRoomSalf(int id,String roomimg, String roomstyle, int money, int roomtotal) {
        this.id = id;
        this.roomimg = roomimg;
        this.roomstyle = roomstyle;
        this.money = money;
        this.roomtotal = roomtotal;
    }

}

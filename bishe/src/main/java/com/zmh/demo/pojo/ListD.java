package com.zmh.demo.pojo;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class ListD {

    private int roomnum;
    private String roomstyle;
    private Date starttime;
    private Date endtime;
    private int money;
    private int cost;
    private String roomimg;

    public ListD(int roomnum, String roomstyle, Date starttime, Date endtime, int money, String roomimg,int cost) {
        this.roomnum = roomnum;
        this.roomstyle = roomstyle;
        this.starttime = starttime;
        this.endtime = endtime;
        this.money = money;
        this.roomimg = roomimg;
        this.cost=cost;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public String getRoomstyle() {
        return roomstyle;
    }

    public void setRoomstyle(String roomstyle) {
        this.roomstyle = roomstyle;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

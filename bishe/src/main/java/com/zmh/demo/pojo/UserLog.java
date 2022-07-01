package com.zmh.demo.pojo;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class UserLog {

    private String username;
    private int roomnum;
    private int cost;
    private Date starttime;
    private Date endtime;

    public UserLog(String username, int roomnum, int cost, Date starttime, Date endtime) {
        this.username = username;
        this.roomnum = roomnum;
        this.cost = cost;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
}

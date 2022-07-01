package com.zmh.demo.pojo;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class ListC {

    private String roomuser;
    private int roomnum;
    private Date endtime;
    private String status;

    public ListC(String roomuser, int roomnum, Date endtime, String status) {
        this.roomuser = roomuser;
        this.roomnum = roomnum;
        this.endtime = endtime;
        this.status = status;
    }

    public String getRoomuser() {
        return roomuser;
    }

    public void setRoomuser(String roomuser) {
        this.roomuser = roomuser;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

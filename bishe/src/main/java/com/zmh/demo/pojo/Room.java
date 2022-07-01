package com.zmh.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Room {

    private int roomnum;
    private String roomstyle;
    private String roomuser;
    private Date starttime;
    private Date endtime;

    public Room(int roomnum, String roomstyle) {
        this.roomnum = roomnum;
        this.roomstyle = roomstyle;
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

    public String getRoomuser() {
        return roomuser;
    }

    public void setRoomuser(String roomuser) {
        this.roomuser = roomuser;
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

package com.zmh.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ListB {

    private int roomnum;
    private String roomuser;
    private String starttime;
    private String endtime;
    private String age;
    private long  phonenumber;

    public ListB(int roomnum, String roomuser, String starttime, String endtime, String age, long phonenumber) {
        this.roomnum = roomnum;
        this.roomuser = roomuser;
        this.starttime = starttime;
        this.endtime = endtime;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public String getRoomuser() {
        return roomuser;
    }

    public void setRoomuser(String roomuser) {
        this.roomuser = roomuser;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}

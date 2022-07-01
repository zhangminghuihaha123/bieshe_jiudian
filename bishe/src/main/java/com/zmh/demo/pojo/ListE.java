package com.zmh.demo.pojo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ListE {

    private String name;

    private String userimg;

    private String roomstyle;

    private String usermessages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public String getRoomstyle() {
        return roomstyle;
    }

    public void setRoomstyle(String roomstyle) {
        this.roomstyle = roomstyle;
    }

    public String getUsermessages() {
        return usermessages;
    }

    public void setUsermessages(String usermessages) {
        this.usermessages = usermessages;
    }

    public ListE(String name, String userimg, String roomstyle, String usermessages) {
        this.name = name;
        this.userimg = userimg;
        this.roomstyle = roomstyle;
        this.usermessages = usermessages;
    }
}

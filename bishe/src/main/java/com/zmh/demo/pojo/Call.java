package com.zmh.demo.pojo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Call {

    private String user;
    private int room;
    private String usercalls;

    public Call(String user, int room, String usercalls) {
        this.user = user;
        this.room = room;
        this.usercalls = usercalls;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getUsercalls() {
        return usercalls;
    }

    public void setUsercalls(String usercalls) {
        this.usercalls = usercalls;
    }
}

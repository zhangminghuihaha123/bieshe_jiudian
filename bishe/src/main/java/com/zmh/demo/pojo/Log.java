package com.zmh.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class Log {

    private int log_id;

    /*状态码，成功为1，失败为2,0代表不录入log日志*/
    private int status;

    private String message;

    private String event;

    private Date time;
    
    public Log(int status, String message, String event, Date time) {
        this.status = status;
        this.message = message;
        this.event = event;
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}

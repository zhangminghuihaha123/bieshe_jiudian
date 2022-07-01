package com.zmh.demo.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class Money {

    @ExcelProperty("当前酒店余额")
    private int money;

    @ExcelProperty("交易时间")
    private Date lasttime;

    @ExcelProperty("物品")
    private String things;

    @ExcelProperty("价格/（收入/支出）")
    private int cost;

    public Money(int money, Date lasttime, String things, int cost) {
        this.money = money;
        this.lasttime = lasttime;
        this.things = things;
        this.cost = cost;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

package com.zmh.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Foods {
    private String foodimg;
    private String foodstyle;
    private int foodmoney;

    public Foods(String foodimg, String foodstyle, int foodmoney) {
        this.foodimg = foodimg;
        this.foodstyle = foodstyle;
        this.foodmoney = foodmoney;
    }

    public String getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(String foodimg) {
        this.foodimg = foodimg;
    }

    public String getFoodstyle() {
        return foodstyle;
    }

    public void setFoodstyle(String foodstyle) {
        this.foodstyle = foodstyle;
    }

    public int getFoodmoney() {
        return foodmoney;
    }

    public void setFoodmoney(int foodmoney) {
        this.foodmoney = foodmoney;
    }
}

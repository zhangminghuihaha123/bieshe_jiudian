package com.zmh.demo.pojo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FoodKc {

      private String food;
      private int foodkc;

    public FoodKc(String food, int foodkc) {
        this.food = food;
        this.foodkc = foodkc;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getFoodkc() {
        return foodkc;
    }

    public void setFoodkc(int foodkc) {
        this.foodkc = foodkc;
    }
}

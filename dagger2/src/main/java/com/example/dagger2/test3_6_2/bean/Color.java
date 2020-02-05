package com.example.dagger2.test3_6_2.bean;

/**
 * Created by Sven.Wong on 2019/3/11
 */

//Color 可能在任何模块中都有。做一单独做一个模块
public class Color {
    String color="green";

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

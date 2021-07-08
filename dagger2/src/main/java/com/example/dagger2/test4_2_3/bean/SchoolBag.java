package com.example.dagger2.test4_2_3.bean;

public class SchoolBag {
    String name;
    Color color;
    Pen pen;

    public SchoolBag(String name, Color color, Pen pen) {
        this.name = name;
        this.color = color;
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "SchoolBag{}" + name + "-" + color.getColor();
    }
}

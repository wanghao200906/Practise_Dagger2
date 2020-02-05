package com.example.dagger2.test4_2_1.bean;

public class Pen {
    private String name;

    public Pen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{}" + name;
    }

}

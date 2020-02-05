package com.example.dagger2.test4_3.bean;

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

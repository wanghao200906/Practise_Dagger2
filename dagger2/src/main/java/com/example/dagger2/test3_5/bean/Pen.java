package com.example.dagger2.test3_5.bean;

import javax.inject.Inject;

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

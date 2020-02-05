package com.example.dagger2.test3_4.bean;

import javax.inject.Inject;

public class Pen {
    String name;

    @Inject
    public Pen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{}" + name;
    }

}

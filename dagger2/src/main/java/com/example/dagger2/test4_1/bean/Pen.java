package com.example.dagger2.test4_1.bean;

import javax.inject.Inject;
import javax.inject.Named;

public class Pen {
    @Named("123435")
    private String name;

    @Inject
    public Pen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{}" + name;
    }

}

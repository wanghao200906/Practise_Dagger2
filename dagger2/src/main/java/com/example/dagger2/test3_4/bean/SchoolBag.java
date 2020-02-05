package com.example.dagger2.test3_4.bean;

import javax.inject.Inject;

public class SchoolBag {
    String name;

    @Inject
    public SchoolBag(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolBag{}" + name;
    }
}

package com.example.dagger2.test3_5.bean;

import javax.inject.Inject;

public class SchoolBag {
    String name;

    public SchoolBag(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolBag{}" + name;
    }
}

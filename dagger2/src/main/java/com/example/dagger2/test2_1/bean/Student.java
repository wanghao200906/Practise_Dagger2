package com.example.dagger2.test2_1.bean;

import javax.inject.Inject;

public class Student {
    @Inject
    public Student() {
    }


    public String study() {
        return "study";
    }
}

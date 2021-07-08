package com.example.dagger2.test2_0.bean;

import javax.inject.Inject;

public class Student {
    @Inject
    public Student(Student2 s) {
    }


    public String study() {
        return "study";
    }
}

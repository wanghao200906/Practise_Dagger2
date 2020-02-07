package com.example.dagger2.test3_1_1.bean;


import javax.inject.Inject;

public class Student implements Teacher {
    @Inject
    public Student() {
    }

    public String study1() {
        return "study  ";
    }

    @Override
    public String study() {
        System.out.println("study");
        return " study test";
    }
}

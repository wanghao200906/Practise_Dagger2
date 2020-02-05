package com.example.dagger2.test2_2.bean;

import javax.inject.Inject;

public class Student {
    private Pen pen;
    private SchoolBag schoolBag;

    @Inject
    public Student(Pen pen, SchoolBag schoolBag) {
        this.pen = pen;
        this.schoolBag = schoolBag;
    }


    public String study() {
        return "study use " + pen.toString() + " and " + schoolBag.toString();
    }
}

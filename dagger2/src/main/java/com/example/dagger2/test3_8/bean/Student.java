package com.example.dagger2.test3_8.bean;


import android.content.Context;

public class Student {
    private Pen pen;

    private SchoolBag schoolBag;

    public Student(Pen pen, SchoolBag schoolBag, Context context) {
        this.pen = pen;
        this.schoolBag = schoolBag;
    }


    public String study() {
        return "study use " + pen.toString() + " and " + schoolBag.toString();
    }
}

package com.example.dagger2.test3_2.bean;

import javax.inject.Inject;

/**
 * Created by Sven.Wong on 2018/8/30
 */

public class Teacher {
    @Inject
    public Teacher() {
    }

    //    @Inject
//    Student student;
    @Inject
    Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }
}

package com.example.svenwong.practise01_dagger2.test2.bean;


import javax.inject.Inject;

public class Pot {


    @Inject
    public Pot() {
    }

    public String show() {
        return "show";
    }
}
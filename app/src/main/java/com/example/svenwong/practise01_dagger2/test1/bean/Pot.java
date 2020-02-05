package com.example.svenwong.practise01_dagger2.test1.bean;


import javax.inject.Inject;

public class Pot {

    static SubPot mSubPot;

    @Inject
    public Pot(SubPot subPot) {
        mSubPot = subPot;
    }

    public static String show() {
        return "show pot" + "-" + mSubPot.show();
    }
}
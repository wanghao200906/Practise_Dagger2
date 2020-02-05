package com.example.svenwong.practise01_dagger2.test1.bean;

import javax.inject.Inject;

/**
 * Created by Sven.Wong on 2019/3/10
 */

public class SubPot {
    @Inject
    public SubPot() {
    }

    public String show() {
        return "show SubPot";
    }
}

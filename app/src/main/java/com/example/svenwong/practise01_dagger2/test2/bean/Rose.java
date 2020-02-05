package com.example.svenwong.practise01_dagger2.test2.bean;

import javax.inject.Inject;

public class Rose {
    @Inject
    public Rose() {
    }

    public String whisper() {
        return "热恋";
    }
}
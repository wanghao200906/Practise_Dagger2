package com.example.svenwong.practise01_dagger2.test6.bean;


import com.example.svenwong.practise01_dagger2.test6.RoseFlower;

import javax.inject.Inject;

public class Pot {

    private Flower flower;


    public Pot(@RoseFlower Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
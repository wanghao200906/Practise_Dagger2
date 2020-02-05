package com.example.svenwong.practise01_dagger2.test5.bean;



import com.example.svenwong.practise01_dagger2.test5.RoseFlower;

import javax.inject.Inject;
public class Pot {

    private Flower flower;

    @Inject
    public Pot(@RoseFlower Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
package com.example.svenwong.practise01_dagger2.test3_2.bean;


import javax.inject.Inject;

public class Pot {



    private Flower flower;

    @Inject
    public Pot(Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }


}
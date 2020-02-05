package com.example.svenwong.practise01_dagger2.test4.bean;


import javax.inject.Inject;
import javax.inject.Named;

public class Pot {


    private Flower flower;

    @Inject
    public Pot(@Named("Lily") Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }


}
package com.example.svenwong.practise01_dagger2.test6;

import com.example.svenwong.practise01_dagger2.test6.bean.Flower;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();
}
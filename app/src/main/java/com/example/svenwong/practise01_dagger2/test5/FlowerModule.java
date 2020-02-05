package com.example.svenwong.practise01_dagger2.test5;

import com.example.svenwong.practise01_dagger2.test5.bean.Flower;
import com.example.svenwong.practise01_dagger2.test5.bean.Lily;
import com.example.svenwong.practise01_dagger2.test5.bean.Rose;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {

    @Provides
    @RoseFlower
    Flower provideRose() {
        return new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily() {
        return new Lily();
    }
}
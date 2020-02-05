package com.example.svenwong.practise01_dagger2.test6;

import com.example.svenwong.practise01_dagger2.test6.bean.Flower;
import com.example.svenwong.practise01_dagger2.test6.bean.Lily;
import com.example.svenwong.practise01_dagger2.test6.bean.Rose;

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
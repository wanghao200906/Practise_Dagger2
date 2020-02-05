package com.example.svenwong.practise01_dagger2.test3_2;

import com.example.svenwong.practise01_dagger2.test3_2.bean.Flower;
import com.example.svenwong.practise01_dagger2.test3_2.bean.Rose;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {
    @Provides
    Flower provideFlowerRose() {
        return new Rose();
    }
}
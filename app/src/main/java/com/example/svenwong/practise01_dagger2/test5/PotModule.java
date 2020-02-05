package com.example.svenwong.practise01_dagger2.test5;


import com.example.svenwong.practise01_dagger2.test6.bean.Flower;
import com.example.svenwong.practise01_dagger2.test6.bean.Pot;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {

    @Provides
    Pot providePot(@RoseFlower Flower flower) {
        return new Pot(flower);
    }
}
package com.example.svenwong.practise01_dagger2.test4;

import com.example.svenwong.practise01_dagger2.test4.bean.Flower;
import com.example.svenwong.practise01_dagger2.test4.bean.Lily;
import com.example.svenwong.practise01_dagger2.test4.bean.Rose;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {

    @Provides
    @Named("Rose")
    Flower provideRose() {
        return new Rose();
    }

    @Provides
    @Named("Lily")
    Flower provideLily() {
        return new Lily();
    }
}

package com.example.svenwong.practise01_dagger2.test3_1;

import com.example.svenwong.practise01_dagger2.test3_1.bean.Pot;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {
    @Provides
    Pot providePot() {
        return new Pot();
    }
}

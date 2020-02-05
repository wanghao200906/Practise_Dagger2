package com.example.dagger2.test4_2_1;


import com.example.dagger2.test4_2_1.bean.Color;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sven.Wong on 2019/3/11
 */
@Module
public class ColorModule2 {
    @Provides
    String colorName() {
        return "red";
    }

    @Singleton
    @Provides
    Color getColor() {
        return new Color(colorName());
    }
}

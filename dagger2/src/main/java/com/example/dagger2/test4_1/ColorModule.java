package com.example.dagger2.test4_1;


import com.example.dagger2.test4_1.bean.Color;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sven.Wong on 2019/3/11
 */
@Module
public class ColorModule {
    @Named("Sdf ")
    @Provides
    String colorName() {
        return "red";
    }

    @Provides
    Color getColor() {
        return new Color(colorName());
    }
}

package com.example.dagger2.test3_6_3;


import com.example.dagger2.test3_6_3.bean.Color;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sven.Wong on 2019/3/11
 */
@Module
public class ColorModule {
    @Provides
    String colorName() {
        return "red";
    }

    @Provides
    Color getColor() {
        return new Color(colorName());
    }
}

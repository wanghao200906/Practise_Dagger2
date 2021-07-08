package com.example.dagger2.test3_7;



import com.example.dagger2.test3_7.bean.Color;

import dagger.Module;
import dagger.Provides;

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

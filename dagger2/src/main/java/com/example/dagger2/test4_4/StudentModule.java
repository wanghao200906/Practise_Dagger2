package com.example.dagger2.test4_4;


import com.example.dagger2.test4_4.ano.StudentSingleton;
import com.example.dagger2.test4_4.bean.Color;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    @Provides
    @StudentSingleton
    Color provideColor() {
        return new Color();
    }
}

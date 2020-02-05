package com.example.dagger2.test3_1;

import com.example.dagger2.test3_1.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    @Provides
    Student getStudent() {
        return new Student();
    }
}

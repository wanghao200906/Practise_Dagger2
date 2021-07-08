package com.example.dagger2.test3_3;

import com.example.dagger2.test3_3.bean.Pen;
import com.example.dagger2.test3_3.bean.SchoolBag;
import com.example.dagger2.test3_3.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
//Pen和SchoolBag都被inject了
    @Provides
    Student getStudent(Pen pen, SchoolBag schoolBag) {
        return new Student(pen,schoolBag);
    }

}

package com.example.dagger2.test3_2;

import com.example.dagger2.test3_2.bean.Pen;
import com.example.dagger2.test3_2.bean.SchoolBag;
import com.example.dagger2.test3_2.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    @Provides
    Student getStudent(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag);
    }

    @Provides
    Pen getPen() {
        return new Pen();
    }

    @Provides
    SchoolBag getSchoolBag() {
        return new SchoolBag();
    }
}

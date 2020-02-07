package com.example.dagger2.test3_1;

import com.example.dagger2.test3_1.bean.Student;
import com.example.dagger2.test3_1.bean.Student2;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    @Provides
    Student getStudent(Student2 s) {
        return new Student();
    }

//    这个获取到的Student2就是给  Student getStudent(Student2 s)的参数使用的
    @Provides
    Student2 getStudent2() {
        return new Student2();
    }
}

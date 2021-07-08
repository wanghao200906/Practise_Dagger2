package com.example.dagger2.test3_1;

import com.example.dagger2.test3_1.bean.Student;

import dagger.Component;



@Component(modules = StudentModule.class)
public interface Test03_1Component {

    void inject(Test03_1Activity test031Activity);

    Student getStudent();
}

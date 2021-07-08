package com.example.dagger2.test2_0;

import com.example.dagger2.test2_0.bean.Student;

import dagger.Component;

/**
 * Created by Sven.Wong on 2020-02-24
 */
@Component
public interface Test123 {
    Student getStudent();


    void inject(Test02_0Activity test02_0Activity);
}

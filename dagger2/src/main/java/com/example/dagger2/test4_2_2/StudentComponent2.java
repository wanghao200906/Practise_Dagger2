package com.example.dagger2.test4_2_2;

import com.example.dagger2.test4_2_2.bean.Student;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sven.Wong on 2019/3/12
 */

@Singleton
@Component(modules = {StudentModule2.class})
public interface StudentComponent2 {
    Student asdfsd();
}

package com.example.dagger2.test4_3;


import com.example.dagger2.test4_3.bean.Color;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sven.Wong on 2019/3/12
 */
//ColorModule 中有Singleton 所以Component中的也得是Singleton
@Singleton
@Component(modules = {ColorModule.class})
public interface ColorComponent {
    Test04_3Component getTest04_3Component(StudentModule studentModule);
}

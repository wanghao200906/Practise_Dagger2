package com.example.dagger2.test4_2;

import com.example.dagger2.test4_2.bean.Color;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sven.Wong on 2019/3/12
 */
//ColorModule 中有Singleton 所以Component中的也得是Singleton
@Singleton
@Component(modules = {ColorModule.class})
public interface ColorComponent {
    Color getColor();//注意这里，没有注入方法，只有一个桥接方法，告诉我提供哪些对象
}

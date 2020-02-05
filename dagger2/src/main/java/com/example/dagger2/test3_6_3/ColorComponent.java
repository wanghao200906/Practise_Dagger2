package com.example.dagger2.test3_6_3;

import com.example.dagger2.test3_6_3.bean.Color;

import dagger.Component;

/**
 * Created by Sven.Wong on 2019/3/11
 */
@Component(modules = {ColorModule.class})
public interface ColorComponent {
//    必须要提供一个返回值。供依赖ColorComponent的Component使用。
//    ColorModule的功能就是提供一个Color,所以在ColorComponent里面也要提供这个方法。其他的Component才可以使用
    Color getColor();
}

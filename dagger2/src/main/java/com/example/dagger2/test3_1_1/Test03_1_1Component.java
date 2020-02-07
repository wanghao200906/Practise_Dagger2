package com.example.dagger2.test3_1_1;


import com.example.dagger2.test3_1_1.bean.Teacher;

import dagger.Component;


@Component(modules = {StudentModule.class})
public interface Test03_1_1Component {

    void inject(Test03_1_1Activity test031Activity);

    //getTeacher名字是随便取的。没有要求
//    虽然返回值是Teacher，但是根据StudentModule中的定义，具体实现类还是Student
    Teacher getTeacher();
}

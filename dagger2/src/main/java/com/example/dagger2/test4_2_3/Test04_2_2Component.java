package com.example.dagger2.test4_2_3;


import com.example.dagger2.test4_2_3.ano.StudentSingleton;

import dagger.Component;


/*
    Test04_2_2Component是StudentSingleton的，ColorComponent2是@Singleton，
    如果在继承一个StudentComponent2也想让StudentComponent2是单利，该怎么弄。暂时没理解
 */
@StudentSingleton
@Component(dependencies = {
//        StudentComponent2.class,
        ColorComponent2.class})
public interface Test04_2_2Component {
    void inject(Test04_2_2Activity test04_2_2Activity);
}
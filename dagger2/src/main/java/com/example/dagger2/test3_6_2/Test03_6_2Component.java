package com.example.dagger2.test3_6_2;

import dagger.Component;

@Component(modules = {StudentModule.class,ColorModule.class})
public interface Test03_6_2Component {
    void inject(Test03_6_2Activity test031Activity);
}

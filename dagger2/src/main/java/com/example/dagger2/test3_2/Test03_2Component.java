package com.example.dagger2.test3_2;

import dagger.Component;

@Component(modules = StudentModule.class)
public interface Test03_2Component {
    void inject(Test03_2Activity test031Activity);
}

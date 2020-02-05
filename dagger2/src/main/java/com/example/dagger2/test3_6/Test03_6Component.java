package com.example.dagger2.test3_6;

import dagger.Component;

@Component(modules = StudentModule.class)
public interface Test03_6Component {
    void inject(Test03_6Activity test031Activity);
}

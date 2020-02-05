package com.example.dagger2.test3_4;

import com.example.dagger2.test3_3.Test03_3Activity;

import dagger.Component;

@Component(modules = {StudentModule.class})
public interface Test03_4Component {
    void inject(Test03_4Activity test031Activity);
}

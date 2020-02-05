package com.example.dagger2.test3_5;

import dagger.Component;

@Component(modules = StudentModule.class)
public interface Test03_5Component {
    void inject(Test03_5Activity test031Activity);
}

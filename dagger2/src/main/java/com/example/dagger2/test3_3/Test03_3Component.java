package com.example.dagger2.test3_3;

import dagger.Component;

@Component(modules = StudentModule.class)
public interface Test03_3Component {
    void inject(Test03_3Activity test031Activity);


}

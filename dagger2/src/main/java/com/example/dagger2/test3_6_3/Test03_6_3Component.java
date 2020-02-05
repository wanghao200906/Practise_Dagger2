package com.example.dagger2.test3_6_3;

import dagger.Component;

@Component(modules = {StudentModule.class},dependencies = ColorComponent.class)
public interface Test03_6_3Component {
    void inject(Test03_6_3Activity test031Activity);
}

package com.example.dagger2.test4_1;


import dagger.Component;

@Component(modules = {StudentModule.class,ColorModule.class})
public interface Test04_1Component {
    void inject(Test04_1Activity test031Activity);
}

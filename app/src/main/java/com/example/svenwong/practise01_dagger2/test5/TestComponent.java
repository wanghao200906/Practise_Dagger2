package com.example.svenwong.practise01_dagger2.test5;


import dagger.Component;

@Component(modules = {FlowerModule.class,PotModule.class})
public interface TestComponent {
    void inject(Test05Activity test05Activity);
}

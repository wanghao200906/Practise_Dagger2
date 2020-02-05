package com.example.svenwong.practise01_dagger2.test3_1;


import dagger.Component;

@Component(modules = PotModule.class)
public interface TestComponent {
    void inject(Test03_1Activity test03_1Activity);
}

package com.example.svenwong.practise01_dagger2.test3_2;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface TestComponent {
    void inject(Test03Activity test03Activity);
}

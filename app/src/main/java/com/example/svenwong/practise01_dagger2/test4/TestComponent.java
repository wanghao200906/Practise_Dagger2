package com.example.svenwong.practise01_dagger2.test4;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface TestComponent {
    void inject(Test04Activity test04Activity);
}

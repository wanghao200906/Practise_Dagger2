package com.example.svenwong.practise01_dagger2.test3_3;

import dagger.Component;

@Component
public interface TestComponent {
    void inject(Test03_3Activity test03Activity);
}

package com.example.svenwong.practise01_dagger2.test2;

import dagger.Component;

@Component
public interface TestComponent {
    void inject(Test02Activity test02Activity);
}

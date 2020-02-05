package com.example.svenwong.practise01_dagger2.test6;

import dagger.Component;

@Component(dependencies = PotComponent.class)
public interface TestComponent {

    void inject(Test06Activity test06Activity);
}

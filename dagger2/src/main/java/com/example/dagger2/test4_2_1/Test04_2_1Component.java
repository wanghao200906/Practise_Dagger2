package com.example.dagger2.test4_2_1;


import android.app.Activity;
import android.content.Context;

import com.example.dagger2.test4_2_1.ano.StudentSingleton;

import dagger.Component;

// component 也可以是抽象类，不一定是接口
@StudentSingleton
@Component(modules = {StudentModule2.class},dependencies = ColorComponent2.class)
public abstract class Test04_2_1Component {
    public static Test04_2_1Component init(Context context) {
        return DaggerTest04_2_1Component.builder().studentModule2(new StudentModule2(context))
                .colorComponent2(DaggerColorComponent2.builder().build())
                .build();
    }
    abstract RPosActivityComponent getActivity();
}

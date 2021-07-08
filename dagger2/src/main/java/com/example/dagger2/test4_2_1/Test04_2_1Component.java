package com.example.dagger2.test4_2_1;


import android.content.Context;

import com.example.dagger2.test4_2_1.ano.StudentSingleton;

import dagger.Component;

/*
    体会@Subcomponent的用法。@Subcomponent还有另一种用法。感觉比较麻烦但是官方推荐。见test4_2_1_1
 */

// component 也可以是抽象类，不一定是接口
@StudentSingleton
@Component(modules = {StudentModule2.class},dependencies = ColorComponent2.class)
public abstract class Test04_2_1Component {
    public static Test04_2_1Component init(Context context) {
        return DaggerTest04_2_1Component.builder().studentModule2(new StudentModule2(context))
                .colorComponent2(DaggerColorComponent2.builder().build())
                .build();
    }
//    RPosActivityComponent是一个@Subcomponent 所以它可以在Component中使用
//    注册Activity的事情可以放到@Subcomponent中取做。
//    Test04_2_1Component是一个总的component。它可以有很多@Subcomponent
    abstract RPosActivityComponent getActivity();
}

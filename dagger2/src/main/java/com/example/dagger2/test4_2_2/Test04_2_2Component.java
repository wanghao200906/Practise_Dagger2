package com.example.dagger2.test4_2_2;



import android.content.Context;

import com.example.dagger2.test4_2_2.ano.StudentSingleton;

import dagger.Component;

/*
    体会@Subcomponent的用法。@Subcomponent还有另一种用法。感觉比较麻烦但是官方推荐。见test4_2_2

    Subcomponent的官方推荐的方法。配合@Module使用
 */

// component 也可以是抽象类，不一定是接口
@StudentSingleton
@Component(modules = {StudentModule2.class,RPosActivityModule.class},dependencies = ColorComponent2.class)
public abstract class Test04_2_2Component {
    public static Test04_2_2Component init(Context context) {
        return DaggerTest04_2_2Component.builder().studentModule2(new StudentModule2(context))
                .colorComponent2(DaggerColorComponent2.builder().build())
                .build();
    }

//    Subcomponent的另一种用法。
    abstract RPosActivityComponent.Fractory getActivity();
}

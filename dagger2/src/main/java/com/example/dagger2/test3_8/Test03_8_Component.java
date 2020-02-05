package com.example.dagger2.test3_8;

import android.content.Context;


import dagger.BindsInstance;
import dagger.Component;


/*
  @Component.Factory 和   @BindsInstance 来配合使用。

 */
@Component(modules = {StudentModule.class, ColorModule.class})
public interface Test03_8_Component {
    void inject(Test03_8_Activity Test03_7_Activity);


//    不知道为什么会报错
    @Component.Factory
    interface Factory123 {
        Test03_8_Component newComponent(@BindsInstance Context context);
    }

}


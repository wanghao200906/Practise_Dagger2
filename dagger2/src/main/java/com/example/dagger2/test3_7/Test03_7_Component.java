package com.example.dagger2.test3_7;

import android.content.Context;

import com.example.dagger2.test3_7.bean.asd;

import dagger.BindsInstance;
import dagger.Component;


/*
 @Component.Builder 和   @BindsInstance 来配合使用。

 BindsInstance 修饰的方法里面会有一个参数。这个参数假如是A类型，如果StudentModule中的方法用到了这个A类型，那么就直接用。

 参考文章：
 https://blog.csdn.net/weixin_34295316/article/details/91362551
 https://blog.csdn.net/qq_23900685/article/details/100161950
 */
@Component(modules = {StudentModule.class, ColorModule.class})
public interface Test03_7_Component {
    void inject(Test03_7_Activity Test03_7_Activity);


    @Component.Builder
    interface Builder123 {

        @BindsInstance
        Builder123 context(Context context);

        @BindsInstance
        Builder123 context2(asd a);

        Test03_7_Component build();
    }

}


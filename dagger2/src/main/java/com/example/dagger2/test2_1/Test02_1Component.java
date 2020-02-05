package com.example.dagger2.test2_1;

import dagger.Component;

@Component
public interface Test02_1Component {

//    Context sdfsd();

    void inject(Test02_1Activity test02_1Activity);


//    另一种写法。暂时用的比较少。dagger 2.2之后用的多了起来
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder tag(Context context);
//
//        Test02_1Component build();
//
//    }
}

package com.example.dagger2.test4_4;


import com.example.dagger2.test4_4.ano.StudentSingleton;
import com.example.dagger2.test4_4.bean.Color;

import dagger.Component;

@StudentSingleton
@Component(modules = {StudentModule.class})
public interface Test04_4Component {
    void inject(Test04_4Activity test031Activity);


    //    这样也可以获取Color对象，前提是Color的构造方法用了@Inject
//    这么看的话，如果类的构造方法用了@Inject，可以再Component中直接
    @StudentSingleton
    Color getColor();



    /*
        如果类A构造方法使用了@Inject,想要在B类中使用这个A类。
            1.可以通过inject的方法
                @Inject
                B b

                Component.create().inject(A)

                这样就可以获取到B对象了

            2.也可以通过这种方法。

               定义Component
               @Singleton
               interface Component{
                    B getB()
               }

               @Singleton
                class B{
                    @Inject
                    public void B(){

                    }

               }

               这样获取B类就是单利的。可以在不同的类中这样使用。
               B b = Component.create().getB()




     */
}

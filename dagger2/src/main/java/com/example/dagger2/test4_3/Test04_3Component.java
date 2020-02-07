package com.example.dagger2.test4_3;



import com.example.dagger2.test4_3.ano.StudentSingleton;

import dagger.Subcomponent;

//subcomponent的Scope 不能大于父类的。父类的ColorComponent是singleton所以子类得不能是singleton 。所以
//子类中的module也不能是singleton。
@StudentSingleton
@Subcomponent(modules = {StudentModule.class})
public interface Test04_3Component {
    void inject(Test04_3Activity test031Activity);
    void inject(Test04_3Activity2 test031Activity);
}

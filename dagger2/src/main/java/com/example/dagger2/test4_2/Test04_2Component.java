package com.example.dagger2.test4_2;


import com.example.dagger2.test4_2.ano.StudentSingleton;

import dagger.Component;

//ColorComponent 是Singleton的。如果想依赖他 不能使Singleton 必须得自己定义一个
//这里面ColorComponent中的color就是一个单利。
//这时候StudentModule 中的就没办法设置为Singleton 了。因为Test04_2Component已经设置了StudentSingleton
//所以如果AComponent中的Module 想是单利的。就无法dependencies 另一个包含单利的Component 了。就需要将AComponent中的Module
//在单独弄一个Component
@StudentSingleton
@Component(modules = {StudentModule.class}, dependencies = {ColorComponent.class})
public interface Test04_2Component {
    void inject(Test04_2Activity test031Activity);
}

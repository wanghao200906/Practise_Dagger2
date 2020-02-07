package com.example.dagger2.test2_0;

import com.example.dagger2.test2_0.bean.Student;

import dagger.Component;

@Component
public interface Test02_0Component {

// 这样写就是通过Test02_0Component来获取Student的方法
// Student的构造方法被@Inject了。
// 如果Student在@Module中也是可以的
    Student getStudent();


    void inject(Test02_0Activity test02_0Activity);
}

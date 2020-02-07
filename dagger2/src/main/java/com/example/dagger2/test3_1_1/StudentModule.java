package com.example.dagger2.test3_1_1;

import com.example.dagger2.test3_1_1.bean.Student;
import com.example.dagger2.test3_1_1.bean.Teacher;

import dagger.Binds;
import dagger.Module;

@Module
abstract public class StudentModule {

    /*
         @Binds 修饰抽象方法，所以Module也得是抽象类
         用处是你在某个类中Inject的是一个接口或者是抽象类。比如@Inject Teacher 是一个接口也不知道具体实现是什么
         这时候就得需要用@Binds了。这个方法名随意，参数就是具体的实现类，返回值就是接口或者抽象类，比如Teacher 。
     */
    @Binds
    abstract Teacher provideStudent(Student s);
}

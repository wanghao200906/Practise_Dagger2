package com.example.dagger2.test3_4;

import com.example.dagger2.test3_4.bean.Pen;
import com.example.dagger2.test3_4.bean.SchoolBag;
import com.example.dagger2.test3_4.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {


    //    SchooleBag 需要传入一个String类型的参数。所以要在Module中提供一个返回String类型的方法。
    @Provides
    String getName() {
        return "box";
    }
//    这里面不能同时返回两个String，因为不知道用哪个了
//    @Provides
//    String getName2() {
//        return "box";
//    }

    @Provides
    Student getStudent(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag);
    }

}

package com.example.dagger2.test3_8;

import android.content.Context;

import com.example.dagger2.test3_8.bean.Color;
import com.example.dagger2.test3_8.bean.Pen;
import com.example.dagger2.test3_8.bean.SchoolBag;
import com.example.dagger2.test3_8.bean.Student;
import com.example.dagger2.test3_8.bean.asd;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {


    //    SchooleBag 需要传入一个String类型的参数。所以要在Module中提供一个返回String类型的方法。
    @Provides
    String getName() {
        return "box";
    }


//    直接传入context
    @Provides
    Student getStudent(Pen pen, SchoolBag schoolBag, Context context) {
        return new Student(pen, schoolBag, context);
    }


    @Provides
    Pen getPen() {
        return new Pen(getName());
    }

    @Provides
    SchoolBag getSchoolBag(Color color ) {
        return new SchoolBag(getName(), color, getPen());
    }
}

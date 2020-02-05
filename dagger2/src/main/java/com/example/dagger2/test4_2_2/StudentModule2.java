package com.example.dagger2.test4_2_2;

import android.content.Context;

import com.example.dagger2.test4_2_2.ano.StudentSingleton2;
import com.example.dagger2.test4_2_2.bean.Color;
import com.example.dagger2.test4_2_2.bean.Pen;
import com.example.dagger2.test4_2_2.bean.SchoolBag;
import com.example.dagger2.test4_2_2.bean.Student;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule2 {
    private Context mContext;

    public StudentModule2(Context context) {
        this.mContext = context;
    }

    //SchooleBag 需要传入一个String类型的参数。所以要在Module中提供一个返回String类型的方法。
    @Provides
    String getName() {
        return "box";
    }

    //
//    @Provides
//    Student getStudent(Pen pen, SchoolBag schoolBag) {
//        return new Student(pen, schoolBag, mContext);
//    }

    @Singleton
    @Provides
    Student getStudent2() {
        return null;
    }


    @Provides
    Pen getPen() {
        return new Pen(getName());
    }

    @Provides
    SchoolBag getSchoolBag(Color color) {
        return new SchoolBag(getName(), color, getPen());
    }
}

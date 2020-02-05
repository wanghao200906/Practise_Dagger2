package com.example.dagger2.test4_1;

import android.content.Context;

import com.example.dagger2.test4_1.ano.release;
import com.example.dagger2.test4_1.ano.test;
import com.example.dagger2.test4_1.bean.Color;
import com.example.dagger2.test4_1.bean.Pen;
import com.example.dagger2.test4_1.bean.SchoolBag;
import com.example.dagger2.test4_1.bean.Student;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module()
public class StudentModule {
    private Context mContext;

    public StudentModule(Context context) {
        this.mContext = context;
    }

    //    SchooleBag 需要传入一个String类型的参数。所以要在Module中提供一个返回String类型的方法。
    @Provides
    String getName() {
        return "box";
    }

    @Provides
    String getName2() {
        return "box2";
    }


    @Named("student2")
    @Provides
    Student getStudent2(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag, mContext);
    }

    @Named("student1")
    @Provides
    Student getStudent1(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag, mContext);
    }
    @test
    @Provides
    Student getStudent3(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag, mContext);
    }

    @release
    @Provides
    Student getStudent4(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag, mContext);
    }

    @Provides
    Pen getPen() {
        return new Pen(getName2());
    }

    @Provides
    SchoolBag getSchoolBag(Color color) {
        return new SchoolBag(getName(), color, getPen());
    }
}

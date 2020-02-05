package com.example.dagger2.test3_6_3;

import android.content.Context;

import com.example.dagger2.test3_6_3.bean.Color;
import com.example.dagger2.test3_6_3.bean.Pen;
import com.example.dagger2.test3_6_3.bean.SchoolBag;
import com.example.dagger2.test3_6_3.bean.Student;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
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
    Student getStudent(Pen pen, SchoolBag schoolBag) {
        return new Student(pen, schoolBag, mContext);
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

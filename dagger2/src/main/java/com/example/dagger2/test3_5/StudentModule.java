package com.example.dagger2.test3_5;

import android.content.Context;

import com.example.dagger2.test3_5.bean.Pen;
import com.example.dagger2.test3_5.bean.SchoolBag;
import com.example.dagger2.test3_5.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
    private Context mContext;

    //   这个构造函数有参数了。所以要显示的进行添加操作
    //   需要给Module传值进来，就得在声明的时候 new
    //   DaggerTest03_5Component.builder().studentModule(new StudentModule(this)).build().inject(this);
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
    SchoolBag getSchoolBag() {
        return new SchoolBag(getName());
    }
}

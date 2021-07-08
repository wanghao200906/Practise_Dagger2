package com.example.dagger2.test3_7;

import android.content.Context;

import com.example.dagger2.test3_7.bean.Color;
import com.example.dagger2.test3_7.bean.Pen;
import com.example.dagger2.test3_7.bean.SchoolBag;
import com.example.dagger2.test3_7.bean.Student;
import com.example.dagger2.test3_7.bean.asd;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {


    /*

    使用了这个代码 在StudentModule中就不用再初始化上下文了。
     @Component.Builder
    interface Builder123 {

        @BindsInstance
        Builder123 context(Context context);

        Test03_8_Component build();
    }

     */
//    private Context mContext;
//
//    public StudentModule(Context context) {
//        this.mContext = context;
//    }


    //    SchooleBag 需要传入一个String类型的参数。所以要在Module中提供一个返回String类型的方法。
    @Provides
    String getName() {
        return "box";
    }


//    可以不这么写了。
//    @Provides
//    Student getStudent(Pen pen, SchoolBag schoolBag) {
//        return new Student(pen, schoolBag, mContext);
//    }

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
    SchoolBag getSchoolBag(Color color, asd a ) {
        return new SchoolBag(getName(), color, getPen());
    }
}

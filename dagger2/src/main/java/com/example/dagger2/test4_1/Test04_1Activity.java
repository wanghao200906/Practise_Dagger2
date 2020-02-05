package com.example.dagger2.test4_1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test4_1.ano.release;
import com.example.dagger2.test4_1.ano.test;
import com.example.dagger2.test4_1.bean.Color;
import com.example.dagger2.test4_1.bean.Student;

import javax.inject.Inject;
import javax.inject.Named;


public class Test04_1Activity extends AppCompatActivity {
    @Named("student1")
    @Inject
    Student student;
    @Named("student2")
    @Inject
    Student student2;
    @test
    @Inject
    Student student3;
    @release
    @Inject
    Student student4;

    @Inject
    Color color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        两种方法都可以
        DaggerTest04_1Component.builder().studentModule(new StudentModule(this))
                .build().inject(this);
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

//        通过 @Name 来限定
        System.out.println("student1:" + student.toString());
        System.out.println("student2:" + student2.toString());
        System.out.println("student3:" + student3.toString());
        System.out.println("student4:" + student4.toString());
    }
}

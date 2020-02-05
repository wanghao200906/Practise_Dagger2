package com.example.dagger2.test2_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test2_2.bean.Pen;
import com.example.dagger2.test2_2.bean.SchoolBag;
import com.example.dagger2.test2_2.bean.Student;

import javax.inject.Inject;

public class Test02_2Activity extends AppCompatActivity {
    @Inject
    Student student;

    @Inject
    Pen pen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        两种方法都可以
        DaggerTest02_2Component.builder().build().inject(this);
//        DaggerTest02_2Component.create().inject(this);
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

//        System.out.println(student.pen.toString());
    }
}

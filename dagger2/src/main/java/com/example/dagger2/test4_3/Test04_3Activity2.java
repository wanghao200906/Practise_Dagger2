package com.example.dagger2.test4_3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test4_3.bean.Color;
import com.example.dagger2.test4_3.bean.Student;

import javax.inject.Inject;


public class Test04_3Activity2 extends AppCompatActivity {
    @Inject
    Student student;
    @Inject
    Student student2;

    @Inject
    Color color1;
    @Inject
    Color color2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorComponent colorComponent = DaggerColorComponent.builder().colorModule(new ColorModule()).build();

        colorComponent.getTest04_3Component(new StudentModule(this)).inject(this);


        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

        System.out.println("student1:" + student.toString());
        System.out.println("student2:" + student2.toString());

        System.out.println("color1:" + color1.toString());
        System.out.println("color2:" + color2.toString());
    }
}

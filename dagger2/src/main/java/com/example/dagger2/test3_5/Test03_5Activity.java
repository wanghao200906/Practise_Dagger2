package com.example.dagger2.test3_5;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test3_5.bean.Student;

import javax.inject.Inject;


public class Test03_5Activity extends AppCompatActivity {
    @Inject
    Student student;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        两种方法都可以
        DaggerTest03_5Component.builder().studentModule(new StudentModule(this)).build().inject(this);
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

    }
}

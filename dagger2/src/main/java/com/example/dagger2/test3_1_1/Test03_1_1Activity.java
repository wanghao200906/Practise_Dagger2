package com.example.dagger2.test3_1_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test3_1_1.bean.Teacher;

import javax.inject.Inject;

public class Test03_1_1Activity extends AppCompatActivity {
    @Inject
    Teacher student;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        两种方法都可以

        DaggerTest03_1_1Component.builder().build().inject(this);
        Toast.makeText(this, this.student.study(), Toast.LENGTH_SHORT).show();

    }
}

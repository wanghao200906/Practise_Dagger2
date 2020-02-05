package com.example.dagger2.test2_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test2_1.bean.Student;

import javax.inject.Inject;

public class Test02_1Activity extends AppCompatActivity {
    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        两种方法都可以
//        DaggerTest02_1Component.builder().build().inject(this);
//        DaggerTest02_1Component.create().inject(this);
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();
    }
}

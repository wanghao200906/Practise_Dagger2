package com.example.dagger2.test3_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test3_2.bean.Student;
import com.example.dagger2.test3_2.bean.Teacher;

import javax.inject.Inject;

public class Test03_2Activity extends AppCompatActivity {
    @Inject
    Student student;

//    @Inject
//    Teacher teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        两种方法都可以
        DaggerTest03_2Component.builder().studentModule(new StudentModule()).build().inject(this);
//        Toast.makeText(this, teacher.getP().toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

    }
}

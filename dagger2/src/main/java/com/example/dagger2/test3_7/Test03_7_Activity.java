package com.example.dagger2.test3_7;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test3_7.bean.Student;

import javax.inject.Inject;


public class Test03_7_Activity extends AppCompatActivity {
    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerTest03_7_Component.builder().studentModule(new StudentModule(this)).build().inject(this);

        App.build.inject(this);
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

    }
}

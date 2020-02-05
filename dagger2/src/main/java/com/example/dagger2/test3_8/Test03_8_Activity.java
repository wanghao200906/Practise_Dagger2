package com.example.dagger2.test3_8;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2.R;


public class Test03_8_Activity extends AppCompatActivity {
//    @Inject
//    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerTest03_7_Component.builder().studentModule(new StudentModule(this)).build().inject(this);
//        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

    }
}

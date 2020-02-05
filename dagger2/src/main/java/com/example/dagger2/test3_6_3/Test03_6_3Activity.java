package com.example.dagger2.test3_6_3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test3_6_3.bean.Color;
import com.example.dagger2.test3_6_3.bean.Student;

import javax.inject.Inject;


public class Test03_6_3Activity extends AppCompatActivity {
    @Inject
    Student student;

    @Inject
    Color color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorComponent build = DaggerColorComponent.builder().build();

        DaggerTest03_6_3Component.builder()
                .studentModule(new StudentModule(this))
                .colorComponent(build)
                .build().inject(this);
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

    }
}

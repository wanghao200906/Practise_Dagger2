package com.example.dagger2.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test1.bean.Student;

public class Test01Activity extends AppCompatActivity {
    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student = new Student();
        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

    }
}

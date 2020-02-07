package com.example.dagger2.test4_2_3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2.R;


public class Test04_2_2Activity extends AppCompatActivity {
//    @Inject
//    Student student;
//    @Inject
//    Student student2;
//
//    @Inject
//    Color color1;
//    @Inject
//    Color color2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ColorComponent2 colorComponent = DaggerColorComponent2.builder().build();
////
//        DaggerTest04_2_2Component.builder().studentModule2(new StudentModule2(this))
//                .colorComponent2(colorComponent)
//                .build().inject(this);
//        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();
////
//        System.out.println("student1:" + student.toString());
//        System.out.println("student2:" + student2.toString());
//
//        System.out.println("color1:" + color1.toString());
//        System.out.println("color2:" + color2.toString());
    }
}

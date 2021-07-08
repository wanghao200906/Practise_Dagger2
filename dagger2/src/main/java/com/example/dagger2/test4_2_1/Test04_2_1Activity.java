package com.example.dagger2.test4_2_1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test4_2_1.bean.Color;
import com.example.dagger2.test4_2_1.bean.Student;

import javax.inject.Inject;

import static android.os.Debug.startMethodTracing;
import static android.os.Debug.stopMethodTracing;


public class Test04_2_1Activity extends AppCompatActivity {
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
// 方法1
//        ColorComponent2 colorComponent = DaggerColorComponent2.builder().build();
////
//        DaggerTest04_2_1Component.builder().studentModule2(new StudentModule2(this))
//                .colorComponent2(colorComponent)
//                .build().inject(this);
//
//
//
//      方法2
//        getActivity是@Subcomponent的方法，需要通过父Component也就是DaggerTest04_2_1Component
//        来一步一步的调用
        DaggerTest04_2_1Component.init(this).getActivity().inject(this);

        Toast.makeText(this, student.study(), Toast.LENGTH_SHORT).show();

        System.out.println("student1:" + student.toString());
        System.out.println("student2:" + student2.toString());

        System.out.println("color1:" + color1.toString());
        System.out.println("color2:" + color2.toString());
        startMethodTracing("sample");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopMethodTracing();
    }
}

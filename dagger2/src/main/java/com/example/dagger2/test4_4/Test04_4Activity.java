package com.example.dagger2.test4_4;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2.R;


public class Test04_4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       也可以这样获取对象
//        Color color = DaggerTest04_4Component.create().getColor();
//        System.out.println("color.color:"+color.color);

    }
}

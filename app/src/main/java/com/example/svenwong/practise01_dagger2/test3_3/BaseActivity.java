package com.example.svenwong.practise01_dagger2.test3_3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.svenwong.practise01_dagger2.R;
import com.example.svenwong.practise01_dagger2.test3_2.DaggerTestComponent;
import com.example.svenwong.practise01_dagger2.test3_2.bean.Pot;
import com.example.svenwong.practise01_dagger2.test3_3.bean.Rose;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    protected Rose rose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}

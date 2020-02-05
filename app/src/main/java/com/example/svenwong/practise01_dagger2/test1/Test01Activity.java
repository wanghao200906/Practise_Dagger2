package com.example.svenwong.practise01_dagger2.test1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.svenwong.practise01_dagger2.R;
import com.example.svenwong.practise01_dagger2.test1.bean.Pot;

public class Test01Activity extends AppCompatActivity {
    private Pot pot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simple);
//        pot = new Pot();


        Toast.makeText(this, Pot.show(), Toast.LENGTH_SHORT).show();
    }
}

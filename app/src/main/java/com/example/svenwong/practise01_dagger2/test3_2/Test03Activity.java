package com.example.svenwong.practise01_dagger2.test3_2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.svenwong.practise01_dagger2.R;
import com.example.svenwong.practise01_dagger2.test3_2.bean.Pot;

import javax.inject.Inject;

public class Test03Activity extends AppCompatActivity {
    @Inject
    Pot pot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simple);

        DaggerTestComponent.create().inject(this);
        Toast.makeText(this, pot.show(), Toast.LENGTH_SHORT).show();

    }


}

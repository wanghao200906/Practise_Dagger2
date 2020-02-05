package com.example.svenwong.practise01_dagger2.test3_3;


import android.os.Bundle;
import android.widget.Toast;

import com.example.svenwong.practise01_dagger2.R;

public class Test03_3Activity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simple);
        DaggerTestComponent.create().inject(this);

        System.out.println("rose.whisper()：" + rose.whisper());

        Toast.makeText(this, rose.whisper(), Toast.LENGTH_SHORT).show();

    }


}

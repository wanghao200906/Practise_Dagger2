package com.example.dagger2.test3_8;


import android.app.Application;

import com.example.dagger2.test3_8.bean.asd;

/**
 * Created by Sven.Wong on 2019/3/12
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        这样所有DaggerTest03_7_Component里面的model都默认有一个context 了
//        DaggerTest03_7_Component.builder().context(this,new asd()).build();
//        DaggerTest03_7_Component.builder().context(this).build();
//        DaggerTest03_7_Component.builder().context2(new asd()).build();

    }
}

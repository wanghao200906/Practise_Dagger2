package com.example.dagger2.test3_8;


import android.app.Application;


/**
 * Created by Sven.Wong on 2019/3/12
 */

public class App extends Application {
    public static Test03_8_Component build;

    @Override
    public void onCreate() {
        super.onCreate();
//        这样所有DaggerTest03_7_Component里面的model都默认有一个context 了
        build = DaggerTest03_8_Component
                .factory()
                .newComponent(this);
    }
}

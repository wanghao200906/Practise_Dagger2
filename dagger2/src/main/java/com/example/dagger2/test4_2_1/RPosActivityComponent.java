package com.example.dagger2.test4_2_1;

import android.app.Activity;

import dagger.Subcomponent;

@Subcomponent
public interface RPosActivityComponent {
    void inject(Test04_2_1Activity activity);
}

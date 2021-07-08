package com.example.dagger2.test4_2_2;

import dagger.Subcomponent;

@Subcomponent
public interface RPosActivityComponent {
    @Subcomponent.Factory
    interface Fractory {
        RPosActivityComponent create();
    }

    void inject(Test04_2_2Activity activity);
}

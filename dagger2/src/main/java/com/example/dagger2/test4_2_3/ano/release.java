package com.example.dagger2.test4_2_3.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Sven.Wong on 2019/3/11
 */


@Qualifier
@Documented
@Retention(RUNTIME)
public @interface release {
}

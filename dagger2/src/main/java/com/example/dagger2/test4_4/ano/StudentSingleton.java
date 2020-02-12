package com.example.dagger2.test4_4.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Sven.Wong on 2019/3/12
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface StudentSingleton {
}


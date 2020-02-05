package com.example.svenwong.practise01_dagger2.test6;

import com.example.svenwong.practise01_dagger2.test6.bean.Pot;

import dagger.Component;

@Component(modules = PotModule.class,dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();
}
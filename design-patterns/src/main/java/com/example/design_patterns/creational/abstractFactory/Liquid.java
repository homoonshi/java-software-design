package com.example.design_patterns.creational.abstractFactory;

import lombok.Getter;

@Getter
public class Liquid {

    private String liquid;

    public void hotWater(){
        liquid = "hotWater";
    }

    public void steamedMilk(){
        liquid = "steamMilk";
    }

}

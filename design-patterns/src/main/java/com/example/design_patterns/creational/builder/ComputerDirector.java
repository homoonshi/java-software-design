package com.example.design_patterns.creational.builder;

public class ComputerDirector {

    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }

}

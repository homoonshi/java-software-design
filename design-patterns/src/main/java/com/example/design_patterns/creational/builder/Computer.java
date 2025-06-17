package com.example.design_patterns.creational.builder;

import lombok.Setter;

@Setter
public class Computer {

    private String cpu;
    private String ram;
    private String storage;

    @Override
    public String toString() {
        return "Computer Configuration : \n"+
                "CPU : " + cpu +"\n"+
                "RAM : " + ram +"\n"+
                "Storage : " + storage;
    }
}

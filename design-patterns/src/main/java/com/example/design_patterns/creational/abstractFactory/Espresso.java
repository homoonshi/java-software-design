package com.example.design_patterns.creational.abstractFactory;

import lombok.Getter;

@Getter
public class Espresso {

    private String espresso;

    public void strong(){
        espresso = "strongEspresso";
    }

    public void mild(){
        espresso = "mildEspresso";
    }

}

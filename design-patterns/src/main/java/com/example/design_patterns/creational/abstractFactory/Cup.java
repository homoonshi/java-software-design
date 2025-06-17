package com.example.design_patterns.creational.abstractFactory;

public class Cup {

    private String cup;
    private Espresso espresso;
    private Liquid liquid;

    public void takeoutCup(){
        cup = "takeout";
    }

    public void mugCup(){
        cup = "mug";
    }

    public void fill(Espresso espresso){
        this.espresso = espresso;
    }

    public void add(Liquid liquid){
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return espresso.getEspresso() + " "
                + liquid.getLiquid() + " "
                + cup;
    }
}

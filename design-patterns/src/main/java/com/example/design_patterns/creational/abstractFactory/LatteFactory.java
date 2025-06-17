package com.example.design_patterns.creational.abstractFactory;

public class LatteFactory implements CoffeeFactory{
    @Override
    public Espresso createEspresso() {
        Espresso espresso = new Espresso();
        espresso.mild();
        return espresso;
    }

    @Override
    public Liquid createLiquid() {
        Liquid liquid = new Liquid();
        liquid.steamedMilk();
        return liquid;
    }

    @Override
    public Cup createCup() {
        Cup cup = new Cup();
        cup.mugCup();
        return cup;
    }
}

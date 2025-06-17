package com.example.design_patterns.creational.abstractFactory;

public class AmericanoFactory implements CoffeeFactory{
    @Override
    public Espresso createEspresso() {
        Espresso espresso = new Espresso();
        espresso.strong();
        return espresso;
    }

    @Override
    public Liquid createLiquid() {
        Liquid liquid = new Liquid();
        liquid.hotWater();
        return liquid;
    }

    @Override
    public Cup createCup() {
        Cup cup = new Cup();
        cup.takeoutCup();
        return cup;
    }
}

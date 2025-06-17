package com.example.design_patterns.creational.abstractFactory;

public class CoffeeMaker {

    private final CoffeeFactory factory;

    public CoffeeMaker(CoffeeFactory factory) {
        this.factory = factory;
    }

    public void makeCoffee(){

        Espresso espresso = factory.createEspresso();
        Liquid liquid = factory.createLiquid();
        Cup cup = factory.createCup();

        cup.fill(espresso);
        cup.add(liquid);

        System.out.println(cup.toString());

    }

}

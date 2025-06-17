package com.example.design_patterns.creational.abstractFactory;

public interface CoffeeFactory {
    Espresso createEspresso();
    Liquid createLiquid();
    Cup createCup();
}

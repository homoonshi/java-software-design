package com.example.design_patterns.creational.factoryMethod;

public class TossPayment implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Toss Payment");
    }
}

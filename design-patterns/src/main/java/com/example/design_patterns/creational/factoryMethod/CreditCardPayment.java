package com.example.design_patterns.creational.factoryMethod;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Process credit card Payment");
    }
}

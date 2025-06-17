package com.example.design_patterns.creational.factoryMethod;

public class DebitCardPayment implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Process debit card Payment");
    }
}

package com.example.design_patterns.creational.factoryMethod;

import org.springframework.stereotype.Component;

@Component
public class PaymentMethodFactoryV2 {
    public PaymentMethod createPaymentMethod(PaymentType type){
        return switch (type) {
            case DEBIT -> new DebitCardPayment();
            case CREDIT -> new CreditCardPayment();
            case TOSS -> new TossPayment();
            default -> null;
        };
    }
}

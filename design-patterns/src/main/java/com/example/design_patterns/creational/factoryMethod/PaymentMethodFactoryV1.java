package com.example.design_patterns.creational.factoryMethod;

import org.springframework.stereotype.Component;

@Component
public class PaymentMethodFactoryV1 {
    public PaymentMethod createPaymentMethod(String type){
        if (type == null || type.isEmpty()){
            return null;
        }
        switch (type) {
            case "DEBIT":
                return new DebitCardPayment();
            case "CREDIT":
                return new CreditCardPayment();
            case "TOSS":
                return new TossPayment();
            default:
                return null;
        }
    }
}

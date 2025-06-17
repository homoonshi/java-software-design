package com.example.design_patterns.creational.factoryMethod;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentMethodFactoryV1 paymentMethodFactoryV1;
    private final PaymentMethodFactoryV2 paymentMethodFactoryV2;

//    @GetMapping("/{type}")
//    public String processPaymentV1(@PathVariable String type){
//        PaymentMethod paymentMethod = paymentMethodFactoryV1.createPaymentMethod(type);
//        paymentMethod.processPayment();
//        return "Payment process";
//    }

    @GetMapping("/{type}")
    public String processPaymentV2(@PathVariable String type){
        PaymentType paymentType = PaymentType.valueOf(type);
        PaymentMethod paymentMethod = paymentMethodFactoryV2.createPaymentMethod(paymentType);
        paymentMethod.processPayment();
        return "Payment process";
    }

}

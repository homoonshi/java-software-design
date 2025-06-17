package com.example.design_patterns.creational.abstractFactory;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cafe")
public class Client {

    @GetMapping("/{coffee}")
    public String orderCoffee(@PathVariable String coffee){

        CoffeeMaker coffeeMaker;

        switch (coffee) {
            case "Americano":
                coffeeMaker = new CoffeeMaker(new AmericanoFactory());
                coffeeMaker.makeCoffee();
                return "americano";
            case "Lattee":
                coffeeMaker = new CoffeeMaker(new LatteFactory());
                coffeeMaker.makeCoffee();
                return "lattee";
        }

        return "null";
    }

}

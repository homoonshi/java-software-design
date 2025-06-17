package com.example.design_patterns.creational.builder;

public class Client {

    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder(new Computer());
        OfficeComputerBuilder officeBuilder = new OfficeComputerBuilder(new Computer());
        ComputerDirector director = new ComputerDirector();

        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();

        director.construct(officeBuilder);
        Computer officeComputer = officeBuilder.getResult();

        System.out.println(gamingComputer.toString());
        System.out.println("");
        System.out.println(officeComputer.toString());
    }

}

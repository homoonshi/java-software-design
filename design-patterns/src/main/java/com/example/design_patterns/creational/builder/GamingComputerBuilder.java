package com.example.design_patterns.creational.builder;

public class GamingComputerBuilder implements Builder{

    private Computer computer;

    public GamingComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void buildCPU() {
        computer.setCpu("ryzen 9 9950X3D");
    }

    @Override
    public void buildRAM() {
        computer.setRam("96GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD, 4TB HDD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}

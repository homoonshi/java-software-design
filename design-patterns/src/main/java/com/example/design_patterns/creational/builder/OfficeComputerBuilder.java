package com.example.design_patterns.creational.builder;

public class OfficeComputerBuilder implements Builder{

    private Computer computer;

    public OfficeComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void buildCPU() {
        computer.setCpu("ryzen 5 7600");
    }

    @Override
    public void buildRAM() {
        computer.setRam("16GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("500GB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}

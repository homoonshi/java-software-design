package com.example.design_patterns.creational.builder;

public interface Builder {

    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();

}

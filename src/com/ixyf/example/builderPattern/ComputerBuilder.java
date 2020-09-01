package com.ixyf.example.builderPattern;

public interface ComputerBuilder {

    void buildCpu();
    void buildMemory();
    void buildDisk();
    Computer buildComputer();
}

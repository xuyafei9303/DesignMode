package com.ixyf.example.builderPattern;

import javax.annotation.Resource;

public class ComputerConcreteBuilder implements ComputerBuilder{

    Computer computer;

    public ComputerConcreteBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("8 core");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16 g");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("1t");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}

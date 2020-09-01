package com.ixyf.example.builderPattern;

public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildDisk();
        return computerBuilder.buildComputer();
    }
}

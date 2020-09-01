package com.ixyf.example.decoratorPattern;

public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        System.out.println("创建了电脑我顺便下载几个电影看看");
    }
}

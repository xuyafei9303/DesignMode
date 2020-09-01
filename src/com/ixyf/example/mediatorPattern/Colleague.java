package com.ixyf.example.mediatorPattern;

public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract boolean operation(String message); // 同事类的操作
}

package com.ixyf.example.templatePattern;

public abstract class AbstractTemplate {
    public void templateMethod() {
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }

    public void checkNumber() {
        System.out.println("check number...");
    }

    public void queueUp() {
        System.out.println("queue up...");
    }

    public abstract void handleBusiness(); // 具体业务办理，留给子类去实现

    public void serviceEvaluation() {
        System.out.println("business finished,service evaluation...");
    }

}

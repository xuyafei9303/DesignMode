package com.ixyf.example.bridgePattern;

public class MyDriverBridge extends DriverManagerBridge{
    @Override
    public void execute() {
        getDriver().executeSQL();
    }
}

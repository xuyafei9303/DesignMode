package com.ixyf.example.bridgePattern;

public abstract class DriverManagerBridge {
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void execute() {
        this.driver.executeSQL();
    }
}

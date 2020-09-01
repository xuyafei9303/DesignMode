package com.ixyf.example.facadePattern;

/**
 * 门面类
 */
public class Starter {
    private Dashboard dashboard;
    private Engine engine;
    private SelfCheck selfCheck;

    public Starter() {
        this.dashboard = new Dashboard();
        this.engine = new Engine();
        this.selfCheck = new SelfCheck();
    }

    public void startUp() {
        System.out.println("car begine startup");
        engine.startup();
        dashboard.startup();
        selfCheck.startupCheck();
        System.out.println("car startup finished");
    }

    public void shutdown() {
        System.out.println("car begine shutdown");
        selfCheck.shutdownCheck();
        engine.shutdown();
        dashboard.shutdown();
        System.out.println("car shutdown finished");
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SelfCheck getSelfCheck() {
        return selfCheck;
    }

    public void setSelfCheck(SelfCheck selfCheck) {
        this.selfCheck = selfCheck;
    }
}

package com.ixyf.example.bridgePattern;

/**
 * 桥接模式
 * 桥接模式将抽象部分和实现部分分离，使其能够独立变化相互之间不受影响
 * jdbc和driverManager就是用了桥接模式
 * jdbc在连接数据库的时候，需要进行各个数据库之间的切换例如mysql、oracle等等
 * driver拥有子类比如mysqlDriver或者oracleDriver等，driver提供了统一的执行sql的接口
 * 抽象类DriverManagerBridge就是桥接的类，相当于搭桥，定义了driver的注入，用户通过注入可以进行不同数据库的切换
 *
 */
public class Main {
    public static void main(String[] args) {
        DriverManagerBridge driverManagerBridge = new MyDriverBridge();
        // 设置mysql驱动
        driverManagerBridge.setDriver(new MysqlDriver());
        driverManagerBridge.execute();

        driverManagerBridge.setDriver(new OracleDriver());
        driverManagerBridge.execute();
    }
}

package com.ixyf.example.facadePattern;

/**
 * 外观模式/门面模式 通过一个门面（Starter）向客户端提供一个访问系统的统一接口，内部细节无须用户关心，降低了访问拥有多个子系统的复杂系统的难度
 * 子系统角色：dashboard、engine、selfCheck
 * 门面角色： starter
 */
public class Main {

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.startUp();
        System.out.println("****************************");
        starter.shutdown();
    }
}

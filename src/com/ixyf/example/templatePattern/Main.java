package com.ixyf.example.templatePattern;

/**
 * 模板方法模式
 * 它定义了一个算法框架，通过继承的方式将算法的实现延迟到子类中，使得子类可以在不改变算法框架的前提下重新定义该算法在某些特定环节的实现
 * 角色：
 * 抽象类(abstract Class): 定义算法的框架，由基本方法和模板方法组成
 * 具体子类(concrete class): 对在抽象类中定义的算法根据需求进行不同的实现
 * 例如案例中，将去银行进行业务办理的部分留在具体子类实现
 */
public class Main {
    public static void main(String[] args) {
        // 办理取钱流程
        AbstractTemplate template1 = new TakeMoney();
        template1.templateMethod();

        // 办理存钱流程
        AbstractTemplate template2 = new SaveMoney();
        template2.templateMethod();


    }
}

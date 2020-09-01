package com.ixyf.example.mediatorPattern;

/**
 * 中介者模式：对象行为型模式
 * 意思是对象和对象之间不直接交互，而是通过一个名为中介者的角色来实现对象之间的交互，是原有对象之间的关系变得松散，且可以通过定义不同的中介者来改变他们之间的交互
 * 角色：
 * 抽象中介者（mediator）：中介者接口，定义了注册同事对象方法和转发同事对象信息的方法
 * 具体中介者（concrete mediator）：中介者接口的实现类，定义了一个list来保存同事对象，协调各个同事之间的交互关系
 * 抽象同事类（colleague）：定义同事类的接口，持有中介者对象，并定义同事对象交互的抽象方法，同时实现同事类的公共方法和功能
 * 具体同事类（concrete colleague）：抽象同事类的实现者，在需要和其他同事对象交互时，通过中介者对象来完成
 * 具体例子比如租房子，角色有房东和租房者，通过中介来进行交易，房东和租房者之间没有沟通和交互
 */
public class Main {
    public static void main(String[] args) {
        // 定义房客同事类
        Colleague colleagueTenant = new ColleagueTenant();
        // 定义房东同事类
        Colleague colleagueLandlord = new ColleagueLandlord();
        // 创建具体中间者，例如中介
        ConcreteMediator concreteMediator = new ConcreteMediator(colleagueTenant, colleagueLandlord);
        boolean result = concreteMediator.notifyColleagueTenant("想租两室一厅吗！");
        if (result) {
            concreteMediator.notifyColleagueLandlord("租客对房间满意");
        } else {
            concreteMediator.notifyColleagueLandlord("租客对房间不满意");
        }
    }
}

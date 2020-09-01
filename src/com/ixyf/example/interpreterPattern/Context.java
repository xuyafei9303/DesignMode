package com.ixyf.example.interpreterPattern;

import java.util.HashMap;

/**
 * 解释器模式
 * 给定一种语言，并定义该语言的语法表示，然后设计一个解析器来解释语言中的语法，常用于sql解析，符号处理
 * 角色：
 * 抽象表达式（abstract expression）：定义解释器的接口，约定解释器所包含的操作比如：interpret
 * 终结符表达式（terminal expression）：抽象表达式的子类，用于定义语法中和终结符有关的操作，语法中的每一个终结符都应有一个与之对应的终结表达式
 * 非终结符表达式（nonterminal expression）：抽象表达式的子类，用来定义语法中和非终结符有关的操作，语法中的每一条规则都有一个非终结符表达式与之对应
 * 环境（context）：定义各个解释器需要的共享数据或者公共的功能
 */
public class Context {
    private HashMap map = new HashMap();
    public void assign(String key, String value) {
        // 在环境中设值
    }
    public String get(String key) {
        // 获取存储在环境类中的值
        return "";
    }
}

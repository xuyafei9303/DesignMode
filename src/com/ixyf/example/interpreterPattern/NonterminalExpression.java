package com.ixyf.example.interpreterPattern;

public class NonterminalExpression implements Expression{
    private Expression left;
    private Expression right;

    public NonterminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context ctx) {
        // 递归调用每一个组成部分的interpret
        // 在递归调用时指定部分的连接方式，即非终止符的功能
    }
}


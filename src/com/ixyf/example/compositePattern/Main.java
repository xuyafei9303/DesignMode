package com.ixyf.example.compositePattern;

/**
 * 组合模式
 * 树形结构node，并定义了children来存储子节点node，下面代码展示了nodeA节点包含了子节点nodeB，通过层层包含来表示层级结构，例如公司员工的层级和部门层级
 */
public class Main {

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        nodeA.add(nodeB);
        System.out.println(nodeA.toString());
    }
}

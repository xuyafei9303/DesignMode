package com.ixyf.example.visitorPattern;

public interface Element {
    void accept(Visitor visitor);
}

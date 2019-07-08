package com.chengzi.designpatterns.behavioral_Patterns.visitor_pattern;


public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);
}

package com.chengzi.designpatterns.behavioral_Patterns.visitor_pattern;


public class Keyboard implements  ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        //doSomething
        computerPartVisitor.visit(this);
    }
}
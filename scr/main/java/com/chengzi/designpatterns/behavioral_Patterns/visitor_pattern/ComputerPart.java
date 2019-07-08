package com.chengzi.designpatterns.behavioral_Patterns.visitor_pattern;


public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

package com.chengzi.designpatterns.behavioral_Patterns.visitor_pattern;

public class Mouse  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
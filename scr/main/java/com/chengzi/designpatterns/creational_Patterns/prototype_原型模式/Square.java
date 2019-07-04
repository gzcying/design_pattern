package com.chengzi.designpatterns.creational_Patterns.prototype_原型模式;

public class Square extends Shape {
 
   public Square(){
     type = ShapeType.Square.name();
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
package com.chengzi.designpatterns.creational_Patterns.prototype_原型模式;

public class Circle extends Shape {
 
   public Circle(){
     type = ShapeType.Circle.name();
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
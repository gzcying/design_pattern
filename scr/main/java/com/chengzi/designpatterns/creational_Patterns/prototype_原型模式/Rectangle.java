package com.chengzi.designpatterns.creational_Patterns.prototype_原型模式;

public class Rectangle extends Shape {

   public Rectangle() {
      type = ShapeType.Rectangle.name();
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}

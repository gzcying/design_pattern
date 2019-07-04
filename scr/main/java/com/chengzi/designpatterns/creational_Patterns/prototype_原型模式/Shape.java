package com.chengzi.designpatterns.creational_Patterns.prototype_原型模式;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public abstract class Shape implements Cloneable, Serializable {
   
   private String id;
   protected String type;
   
   abstract void draw();

   public Object clone() {
      Object clone = null;
      try {
         clone = super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }

   public enum ShapeType {
      Circle, Rectangle, Square;
   }

}
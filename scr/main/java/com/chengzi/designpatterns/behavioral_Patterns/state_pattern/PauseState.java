package com.chengzi.designpatterns.behavioral_Patterns.state_pattern;

public class PauseState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in pause state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Pause State";
   }
}
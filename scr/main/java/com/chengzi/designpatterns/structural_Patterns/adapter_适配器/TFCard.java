package com.chengzi.designpatterns.structural_Patterns.adapter_适配器;

public interface TFCard {
    String readTF();    
    int writeTF(String msg);
}
package com.chengzi.designpatterns.structural_Patterns.adapter_适配器;

public class ThinkpadComputer implements Computer {
    @Override    
    public String readSD(SDCard sdCard) {        
        if(sdCard == null)throw new NullPointerException("sd card null");        
        return sdCard.readSD();    
    }
}
package com.chengzi.designpatterns.structural_Patterns.adapter_适配器;

/**
 * @author chengzi
 * 2019/7/3
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public int writeSD(String msg) {
        return tfCard.writeTF(msg);
    }
}

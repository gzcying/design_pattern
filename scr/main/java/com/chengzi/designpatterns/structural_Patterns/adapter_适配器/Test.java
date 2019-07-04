package com.chengzi.designpatterns.structural_Patterns.adapter_适配器;

//@see "https://www.runoob.com/design-pattern/adapter-pattern.html"
public class Test {
    /**
     * 例子：笔记本通过读取SD卡,适配去读取TF卡；
     */
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("====================================");

        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}
package com.chengzi.designpatterns.creational_Patterns.builder_建造者模式;

import lombok.Data;

// 省略 getter 和 setter 方法
@Data
public class Computer { 
    private String cpu; 
    private String screen; 
    private String memory; 
    private String mainboard; 
    public Computer(String cpu, String screen, String memory, String mainboard) { 
        this.cpu = cpu; 
        this.screen = screen; 
        this.memory = memory; 
        this.mainboard = mainboard; 
    } 
} 
package com.chengzi.designpatterns.creational_Patterns.builder_建造者模式;

public class Client {
    public static void main(String[] args) {
        // 非 Builder 模式 
        Computer computer = new Computer("amd", "aoc", "Samsung", "罗技");
        System.out.format("old new computer:%s \n", computer.toString());

        // Builder 模式
        NewComputer newComputer = NewComputer.Builder.newBuilder()
                .cpu("intel")
                .screen("hp")
                .memory("金斯顿")
                .mainboard("雷柏")
                .build();
        System.out.format("new computer from builder:%s \n", newComputer.toString());
    }
} 
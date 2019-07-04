package com.chengzi.designpatterns.creational_Patterns.builder_建造者模式;

import lombok.ToString;

@ToString
public class NewComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private NewComputer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        private Builder() {
        }

        public static Builder newBuilder(){
            return new Builder();
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }

        public NewComputer build() {
            return new NewComputer(this.cpu,this.screen,this.memory,this.mainboard);
        }
    }
} 
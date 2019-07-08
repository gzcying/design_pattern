package com.chengzi.designpatterns.behavioral_Patterns.observer_pattern;

import java.util.Observable;

public class Subject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.setChanged();
        this.notifyObservers();
    }
}
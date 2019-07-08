package com.chengzi.designpatterns.behavioral_Patterns.observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver implements Observer {
    public HexaObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            System.out.println("hexadecimal String: " + Integer.toHexString(((Subject) o).getState()));
        }
    }
}
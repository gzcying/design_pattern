package com.chengzi.designpatterns.behavioral_Patterns.observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class OctalObserver implements Observer {
    public OctalObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            System.out.println("octal String: " + Integer.toOctalString(((Subject) o).getState()));
        }
    }
}
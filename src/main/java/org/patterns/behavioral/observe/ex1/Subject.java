package org.patterns.behavioral.observe.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 14/11/21
 * Time: 1:47 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Subject {
    private final List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void notifyAllObserver() {
        observerList.forEach(Observer::update);
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }
}

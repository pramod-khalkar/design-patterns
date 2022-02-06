package org.design.pattern.behavioral.memento.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 21/11/21
 * Time: 7:53 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento getMemento() {
        return this.mementoList.get(1);
    }
}

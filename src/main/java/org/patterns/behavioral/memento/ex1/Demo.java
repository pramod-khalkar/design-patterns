package org.patterns.behavioral.memento.ex1;

/**
 * Date: 21/11/21
 * Time: 7:55 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("state1");
        originator.setState("state2");
        careTaker.addMemento(originator.save());
        System.out.println(originator.getState());

        originator.setState("state3");
        careTaker.addMemento(originator.save());
        System.out.println(originator.getState());

        originator.setState("state4");
        System.out.println(originator.getState());
        originator.restore(careTaker.getMemento());
        System.out.println(originator.getState());
    }
}

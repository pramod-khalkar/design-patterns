package org.design.pattern.behavioral.observe.ex1;

/**
 * Date: 14/11/21
 * Time: 1:58 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        subject.setState(10);
        subject.setState(11);
    }
}

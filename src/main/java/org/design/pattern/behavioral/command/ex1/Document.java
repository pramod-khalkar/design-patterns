package org.design.pattern.behavioral.command.ex1;

/**
 * Date: 18/11/21
 * Time: 3:15 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Document {

    public void open() {
        System.out.println("document opening");
    }

    public void save() {
        System.out.println("Document saving");
    }

    public void close() {
        System.out.println("Document closing");
    }
}

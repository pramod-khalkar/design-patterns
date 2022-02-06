package org.design.pattern.structural.composite.ex2;

/**
 * Date: 12/11/21
 * Time: 7:32 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Lecture {
    private String name;

    public Lecture(String name) {
        this.name = name;
    }

    public void display(String indentLevel) {
        System.out.println(indentLevel + this.name);
    }
}

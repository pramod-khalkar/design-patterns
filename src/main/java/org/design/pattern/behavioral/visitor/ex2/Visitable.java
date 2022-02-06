package org.design.pattern.behavioral.visitor.ex2;

/**
 * Date: 19/11/21
 * Time: 3:29 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public interface Visitable {
    void accept(Visitor visitor);
}

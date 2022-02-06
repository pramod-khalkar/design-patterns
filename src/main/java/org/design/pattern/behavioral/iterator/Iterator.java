package org.design.pattern.behavioral.iterator;

/**
 * Date: 21/11/21
 * Time: 11:18 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}

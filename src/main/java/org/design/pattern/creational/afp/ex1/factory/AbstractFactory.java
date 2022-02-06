package org.design.pattern.creational.afp.ex1.factory;

/**
 * Date: 01/11/21
 * Time: 3:13 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public interface AbstractFactory<T, E> {
    T create(E type);
}

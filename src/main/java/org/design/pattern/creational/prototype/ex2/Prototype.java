package org.design.pattern.creational.prototype.ex2;

/**
 * Date: 05/11/21
 * Time: 3:13 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public interface Prototype<T> extends Cloneable {
    T clone() throws CloneNotSupportedException;
}

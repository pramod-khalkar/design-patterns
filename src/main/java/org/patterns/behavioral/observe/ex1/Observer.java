package org.patterns.behavioral.observe.ex1;

/**
 * Date: 14/11/21
 * Time: 1:47 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class Observer{
    protected Subject subject;
    abstract void update();
}

package org.design.pattern.creational.afp.ex2;

/**
 * Date: 02/11/21
 * Time: 10:47 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public interface GUIFactory {
    IButton getButton();

    ICheckbox getCheckbox();
}

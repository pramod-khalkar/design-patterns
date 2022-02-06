package org.design.pattern.creational.afp.ex2.mac;

import org.design.pattern.creational.afp.ex2.ICheckbox;

/**
 * Date: 02/11/21
 * Time: 10:46 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class MacCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("This is mac checkbox");
    }
}

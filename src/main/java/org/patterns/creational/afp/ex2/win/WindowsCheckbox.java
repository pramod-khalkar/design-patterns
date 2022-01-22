package org.patterns.creational.afp.ex2.win;

import org.pk.ground.design.creational.afp.ex2.ICheckbox;

/**
 * Date: 02/11/21
 * Time: 10:45 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("This is windows checkbox");
    }
}

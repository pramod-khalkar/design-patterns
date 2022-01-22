package org.patterns.creational.afp.ex2.mac;

import org.pk.ground.design.creational.afp.ex2.IButton;

/**
 * Date: 02/11/21
 * Time: 10:45 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class MacButton implements IButton {

    @Override
    public void paint() {
        System.out.println("This is mac button");
    }
}

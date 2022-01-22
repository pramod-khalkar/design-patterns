package org.patterns.creational.afp.ex2.win;

import org.pk.ground.design.creational.afp.ex2.GUIFactory;
import org.pk.ground.design.creational.afp.ex2.IButton;
import org.pk.ground.design.creational.afp.ex2.ICheckbox;

/**
 * Date: 02/11/21
 * Time: 10:48 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public IButton getButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox getCheckbox() {
        return new WindowsCheckbox();
    }
}

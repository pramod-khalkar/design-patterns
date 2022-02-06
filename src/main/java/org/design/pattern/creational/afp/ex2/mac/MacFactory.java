package org.design.pattern.creational.afp.ex2.mac;

import org.design.pattern.creational.afp.ex2.GUIFactory;
import org.design.pattern.creational.afp.ex2.IButton;
import org.design.pattern.creational.afp.ex2.ICheckbox;

/**
 * Date: 02/11/21
 * Time: 10:49 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class MacFactory implements GUIFactory {
    @Override
    public IButton getButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox getCheckbox() {
        return new MacCheckbox();
    }
}

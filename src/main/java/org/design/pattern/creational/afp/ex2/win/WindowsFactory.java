package org.design.pattern.creational.afp.ex2.win;

import org.design.pattern.creational.afp.ex2.GUIFactory;
import org.design.pattern.creational.afp.ex2.IButton;
import org.design.pattern.creational.afp.ex2.ICheckbox;

/**
 * Date: 02/11/21
 * Time: 10:48 am
 * This file is project specific to design patterns
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

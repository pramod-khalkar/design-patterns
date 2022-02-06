package org.design.pattern.creational.afp.ex2;

/**
 * Date: 02/11/21
 * Time: 10:52 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Application {

    private GUIFactory guiFactory;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void paint() {
        guiFactory.getButton().paint();
        guiFactory.getCheckbox().paint();
    }
}

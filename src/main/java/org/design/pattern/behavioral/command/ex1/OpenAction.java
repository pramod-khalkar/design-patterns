package org.design.pattern.behavioral.command.ex1;

/**
 * Date: 18/11/21
 * Time: 3:18 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class OpenAction implements Action {
    private final Document document;

    public OpenAction(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.open();
    }
}

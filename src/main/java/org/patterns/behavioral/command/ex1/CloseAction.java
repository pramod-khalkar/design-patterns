package org.patterns.behavioral.command.ex1;

/**
 * Date: 18/11/21
 * Time: 3:18 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class CloseAction implements Action {

    private final Document document;

    public CloseAction(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.close();
    }
}

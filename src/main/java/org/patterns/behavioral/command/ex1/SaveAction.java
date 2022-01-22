package org.patterns.behavioral.command.ex1;

/**
 * Date: 18/11/21
 * Time: 3:17 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class SaveAction implements Action {
    private final Document document;

    public SaveAction(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.save();
    }
}

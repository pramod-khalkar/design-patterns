package org.design.pattern.behavioral.memento.ex2;

/**
 * Date: 21/11/21
 * Time: 2:45 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class FileWriterCareTaker {

    private Memento memento;

    public void save(FileWriterUtil fileWriterUtil) {
        this.memento = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil) {
        fileWriterUtil.undoToLastSave(this.memento);
    }
}

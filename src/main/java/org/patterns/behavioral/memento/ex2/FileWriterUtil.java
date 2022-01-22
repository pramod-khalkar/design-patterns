package org.patterns.behavioral.memento.ex2;

/**
 * Date: 21/11/21
 * Time: 2:38 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String text) {
        this.content.append(text);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Memento memento) {
        this.fileName = memento.getFileName();
        this.content = memento.getContent();
    }
}

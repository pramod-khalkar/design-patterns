package org.patterns.behavioral.memento.ex2;

/**
 * Date: 21/11/21
 * Time: 2:37 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Memento {

    private final String fileName;
    private final StringBuilder content;

    public Memento(String fileName, StringBuilder content) {
        this.fileName = fileName;
        this.content = new StringBuilder(content);
    }

    public StringBuilder getContent() {
        return content;
    }

    public String getFileName() {
        return fileName;
    }
}

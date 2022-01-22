package org.patterns.creational.builder.ex3;

/**
 * Date: 03/11/21
 * Time: 12:58 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public interface Converter {
    void makeLine();

    void Table();

    void makeParagraph();

    Document getDocument();
}

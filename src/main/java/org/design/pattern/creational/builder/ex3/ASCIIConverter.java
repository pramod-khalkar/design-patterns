package org.design.pattern.creational.builder.ex3;

/**
 * Date: 03/11/21
 * Time: 12:59 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ASCIIConverter implements Converter {

    @Override
    public void makeLine() {
        System.out.println("making line in ASCII converter");
    }

    @Override
    public void Table() {
        System.out.println("table in ASCII converter");
    }

    @Override
    public void makeParagraph() {
        System.out.println("paragraph in ASCII converter");
    }

    @Override
    public Document getDocument() {
        makeLine();
        Table();
        makeParagraph();
        return new Document();
    }
}

package org.design.pattern.creational.builder.ex3;

/**
 * Date: 03/11/21
 * Time: 1:02 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class PDFConverter implements Converter {
    @Override
    public void makeLine() {
        System.out.println("making line in PDF");
    }

    @Override
    public void Table() {
        System.out.println("table in PDF");
    }

    @Override
    public void makeParagraph() {
        System.out.println("paragraph in PDF");
    }

    @Override
    public Document getDocument() {
        makeLine();
        Table();
        makeParagraph();
        return new Document();
    }
}

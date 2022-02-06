package org.design.pattern.creational.builder.ex3;

/**
 * Date: 03/11/21
 * Time: 1:00 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class PostScriptConverter implements Converter {
    @Override
    public void makeLine() {
        System.out.println("making line in post script");
    }

    @Override
    public void Table() {
        System.out.println("table in post script converter");
    }

    @Override
    public void makeParagraph() {
        System.out.println("paragraph in post script");
    }

    @Override
    public Document getDocument() {
        makeLine();
        Table();
        makeParagraph();
        return new Document();
    }
}

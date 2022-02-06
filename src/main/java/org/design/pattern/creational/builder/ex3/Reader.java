package org.design.pattern.creational.builder.ex3;

/**
 * Date: 03/11/21
 * Time: 1:09 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Reader {

    public Document asciiReader() {
        ASCIIConverter asciiConverter = new ASCIIConverter();
        return asciiConverter.getDocument();
    }

    public Document postScriptReader() {
        PostScriptConverter postScriptConverter = new PostScriptConverter();
        return postScriptConverter.getDocument();
    }

    public Document PDFReader() {
        PDFConverter pdfReader = new PDFConverter();
        return pdfReader.getDocument();
    }
}

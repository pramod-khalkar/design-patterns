package org.design.pattern.structural.proxy.ex1;

/**
 * Date: 14/11/21
 * Time: 8:49 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(this.fileName);
        }
        this.realImage.display();
    }
}

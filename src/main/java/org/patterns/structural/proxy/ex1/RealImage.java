package org.patterns.structural.proxy.ex1;

/**
 * Date: 14/11/21
 * Time: 8:46 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFileFromDisk(fileName);
    }

    private void loadFileFromDisk(String fileName) {
        System.out.printf("Loading %s from disk \n", fileName);
    }

    @Override
    public void display() {
        System.out.printf("Displaying %s image \n", this.fileName);
    }
}

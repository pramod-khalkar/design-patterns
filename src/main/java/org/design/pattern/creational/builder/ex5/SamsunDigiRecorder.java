package org.design.pattern.creational.builder.ex5;

/**
 * Date: 04/11/21
 * Time: 8:14 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class SamsunDigiRecorder extends Recorder {

    @Override
    public String pack() {
        return "samsung digital recorder";
    }

    @Override
    public float price() {
        return 20f;
    }

    @Override
    String type() {
        return "Digital";
    }
}

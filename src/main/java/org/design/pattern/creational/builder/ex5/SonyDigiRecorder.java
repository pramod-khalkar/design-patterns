package org.design.pattern.creational.builder.ex5;

/**
 * Date: 04/11/21
 * Time: 8:05 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class SonyDigiRecorder extends Recorder {

    @Override
    public String pack() {
        return "Sony digital recorder";
    }

    @Override
    public float price() {
        return 20f;
    }

    @Override
    String type() {
        return "digital";
    }
}

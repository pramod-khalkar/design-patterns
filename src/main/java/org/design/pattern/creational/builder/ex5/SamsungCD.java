package org.design.pattern.creational.builder.ex5;

/**
 * Date: 04/11/21
 * Time: 7:45 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class SamsungCD extends Company{

    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}

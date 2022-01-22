package org.patterns.creational.afp.ex1.factory;

/**
 * Date: 01/11/21
 * Time: 3:17 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class FactoryProvider {

    public static AnimalFactory animalFactory() {
        return new AnimalFactory();
    }

    public static ColorFactory colorFactory() {
        return new ColorFactory();
    }
}

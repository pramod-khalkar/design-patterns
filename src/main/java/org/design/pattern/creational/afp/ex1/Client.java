package org.design.pattern.creational.afp.ex1;

import org.design.pattern.creational.afp.ex1.factory.AnimalFactory;
import org.design.pattern.creational.afp.ex1.factory.ColorFactory;
import org.design.pattern.creational.afp.ex1.factory.FactoryProvider;

/**
 * Date: 01/11/21
 * Time: 3:17 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        FactoryProvider.animalFactory().create(AnimalFactory.AnimalType.DOG).speak();
        FactoryProvider.colorFactory().create(ColorFactory.ColorType.WHITE).printName();
    }
}

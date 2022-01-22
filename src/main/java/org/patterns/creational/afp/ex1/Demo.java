package org.patterns.creational.afp.ex1;

import org.pk.ground.design.creational.afp.ex1.factory.AnimalFactory;
import org.pk.ground.design.creational.afp.ex1.factory.ColorFactory;
import org.pk.ground.design.creational.afp.ex1.factory.FactoryProvider;

/**
 * Date: 01/11/21
 * Time: 3:17 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        FactoryProvider.animalFactory().create(AnimalFactory.AnimalType.DOG).speak();
        FactoryProvider.colorFactory().create(ColorFactory.ColorType.WHITE).printName();
    }
}

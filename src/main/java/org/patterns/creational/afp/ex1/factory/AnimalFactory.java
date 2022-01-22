package org.patterns.creational.afp.ex1.factory;

import org.pk.ground.design.creational.afp.ex1.animal.Animal;
import org.pk.ground.design.creational.afp.ex1.animal.Cat;
import org.pk.ground.design.creational.afp.ex1.animal.Dog;

/**
 * Date: 01/11/21
 * Time: 3:16 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class AnimalFactory implements AbstractFactory<Animal, AnimalFactory.AnimalType> {

    @Override
    public Animal create(AnimalType type) {
        if (type == AnimalType.DOG) {
            return new Dog();
        } else if (type == AnimalType.CAT) {
            return new Cat();
        }
        return null;
    }

    public enum AnimalType {
        DOG, CAT
    }
}

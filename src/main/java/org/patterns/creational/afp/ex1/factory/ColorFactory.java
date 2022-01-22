package org.patterns.creational.afp.ex1.factory;

import org.pk.ground.design.creational.afp.ex1.color.Black;
import org.pk.ground.design.creational.afp.ex1.color.Color;
import org.pk.ground.design.creational.afp.ex1.color.White;

/**
 * Date: 01/11/21
 * Time: 3:14 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class ColorFactory implements AbstractFactory<Color, ColorFactory.ColorType> {

    @Override
    public Color create(ColorType type) {
        if (type == ColorType.BLACK) {
            return new Black();
        } else if (type == ColorType.WHITE) {
            return new White();
        }
        return null;
    }

    public enum ColorType {
        BLACK, WHITE
    }
}

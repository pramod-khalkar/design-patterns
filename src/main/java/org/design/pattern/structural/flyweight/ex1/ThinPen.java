package org.design.pattern.structural.flyweight.ex1;

/**
 * Date: 14/11/21
 * Time: 6:52 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ThinPen implements Pen {

    private final BrushSize brushSize = BrushSize.THIN;
    private String color = null;

    @Override
    public void draw(String content) {
        System.out.println("THIN " + content + " in " + color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

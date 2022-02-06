package org.design.pattern.structural.flyweight.ex1;

/**
 * Date: 14/11/21
 * Time: 6:49 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class ThickPen implements Pen {

    private final BrushSize brushSize = BrushSize.THICK;
    private String color = null;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("THICK " + content + " in " + color);
    }
}

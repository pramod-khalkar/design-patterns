package org.patterns.structural.flyweight.ex1;

/**
 * Date: 14/11/21
 * Time: 6:54 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class MediumPen implements Pen {

    private final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("MEDIUM " + content + " in " + color);
    }
}

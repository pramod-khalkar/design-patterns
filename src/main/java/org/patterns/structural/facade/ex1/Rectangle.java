package org.patterns.structural.facade.ex1;

/**
 * Date: 13/11/21
 * Time: 3:18 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

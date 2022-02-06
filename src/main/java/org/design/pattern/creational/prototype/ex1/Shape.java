package org.design.pattern.creational.prototype.ex1;

/**
 * Date: 04/11/21
 * Time: 1:31 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

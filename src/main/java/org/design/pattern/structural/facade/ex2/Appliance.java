package org.design.pattern.structural.facade.ex2;

/**
 * Date: 13/11/21
 * Time: 3:27 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public abstract class Appliance implements Comparable<Appliance> {

    protected String name;
    protected boolean status;

    public Appliance(String name) {
        super();
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Appliancd name is mandatory for home automation");
        }
        this.name = name;
    }

    public void on() {
        if (status) {
            System.out.printf("%s already turn on. \n", this.name);
        } else {
            status = true;
            System.out.printf("%s turning on\n", this.name);
        }
    }

    public void off() {
        if (!status) {
            System.out.printf("%s is already turn off\n", this.name);
        } else {
            status = false;
            System.out.printf("%s turning off\n", this.name);
        }
    }

    @Override
    public int compareTo(Appliance other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String getName() {
        return this.name;
    }
}

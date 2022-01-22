package org.patterns.creational.prototype.ex2;

/**
 * Date: 05/11/21
 * Time: 3:13 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class EmpRecord implements Prototype<EmpRecord> {

    private String name;
    private Integer age;
    private String occupation;

    public EmpRecord() {
        System.out.println("\nname : age : occupation");
    }

    public EmpRecord(String name, String occupation, Integer age) {
        this();
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public void show() {
        System.out.printf("%s %s %s\n", this.name, this.age, this.occupation);
    }

    @Override
    public EmpRecord clone() throws CloneNotSupportedException {
        return (EmpRecord) super.clone();
    }
}

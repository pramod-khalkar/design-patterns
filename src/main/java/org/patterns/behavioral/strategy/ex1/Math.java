package org.patterns.behavioral.strategy.ex1;

/**
 * Date: 18/11/21
 * Time: 7:11 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Math {
    private final Operation operation;

    public Math(Operation operation) {
        this.operation = operation;
    }

    public int performOperation(int no1, int no2) {
        return this.operation.doOperate(no1, no2);
    }
}

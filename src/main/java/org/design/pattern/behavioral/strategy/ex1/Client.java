package org.design.pattern.behavioral.strategy.ex1;

/**
 * Date: 18/11/21
 * Time: 7:10 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Math math = new Math(new Addition());
        System.out.println(math.performOperation(10, 20));

        math = new Math(new Multiply());
        System.out.println(math.performOperation(10, 20));
    }
}

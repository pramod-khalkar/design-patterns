package org.design.pattern.behavioral.strategy.ex1;

/**
 * Date: 18/11/21
 * Time: 7:09 am
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Addition implements Operation {

    @Override
    public int doOperate(int no1, int no2) {
        return no1 + no2;
    }
}

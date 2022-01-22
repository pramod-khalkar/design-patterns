package org.patterns.behavioral.strategy.ex1;

/**
 * Date: 18/11/21
 * Time: 7:10 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Subtract implements Operation {

    @Override
    public int doOperate(int no1, int no2) {
        return no1 - no2;
    }
}

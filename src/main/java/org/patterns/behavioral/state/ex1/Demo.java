package org.patterns.behavioral.state.ex1;

/**
 * Date: 14/11/21
 * Time: 2:58 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        StartState startState = new StartState();
        StopState stopState = new StopState();

        Context context = new Context();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}

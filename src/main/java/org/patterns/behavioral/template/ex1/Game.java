package org.patterns.behavioral.template.ex1;

/**
 * Date: 19/11/21
 * Time: 4:05 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public abstract class Game {
    protected abstract void initialize();

    protected abstract void start();

    protected abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}

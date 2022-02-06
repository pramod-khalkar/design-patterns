package org.design.pattern.behavioral.template.ex1;

/**
 * Date: 19/11/21
 * Time: 4:11 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}

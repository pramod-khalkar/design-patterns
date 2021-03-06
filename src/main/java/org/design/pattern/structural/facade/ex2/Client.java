package org.design.pattern.structural.facade.ex2;

import java.util.Arrays;

/**
 * Date: 13/11/21
 * Time: 5:23 pm
 * This file is project specific to design patterns
 * Author: Pramod Khalkar
 */
public class Client {

    public static void main(String[] args) {
        Home home = new Home();

        //home.playMovieOnNetflix("Spider man");
        //home.stopMovie();

        home.prepareFood(Arrays.asList("small pizza", "large pizza"));
        home.closeKitchen();
    }
}

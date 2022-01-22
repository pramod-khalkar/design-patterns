package org.patterns.behavioral.command.ex2;

/**
 * Date: 18/11/21
 * Time: 7:01 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Light hallLight = new Light();
        LightOnCommand onCommand = new LightOnCommand(hallLight);
        LightOffCommand offCommand = new LightOffCommand(hallLight);
        SwitchButton button = new SwitchButton(offCommand, onCommand);

        button.flipDown();
        button.flipUp();
    }
}

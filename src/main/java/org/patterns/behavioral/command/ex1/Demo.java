package org.patterns.behavioral.command.ex1;

/**
 * Date: 18/11/21
 * Time: 3:19 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Document document = new Document();
        MenuOption menuOption = new MenuOption(
                new OpenAction(document),
                new CloseAction(document),
                new SaveAction(document)
        );

        menuOption.open();
        menuOption.save();
        menuOption.close();
    }
}

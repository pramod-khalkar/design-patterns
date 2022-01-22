package org.patterns.behavioral.memento.ex2;

/**
 * Date: 21/11/21
 * Time: 2:47 pm
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        FileWriterCareTaker fileWriterCareTaker = new FileWriterCareTaker();
        FileWriterUtil filwWriter = new FileWriterUtil("text.txt");

        filwWriter.write("First text 1\n");
        System.out.println(filwWriter + "\n\n");
        fileWriterCareTaker.save(filwWriter);
        filwWriter.write("Second text 2\n");
        System.out.println(filwWriter + "\n\n");
        fileWriterCareTaker.undo(filwWriter);
        System.out.println(filwWriter + "\n\n");
    }
}

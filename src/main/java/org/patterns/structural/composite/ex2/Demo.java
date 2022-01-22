package org.patterns.structural.composite.ex2;

/**
 * Date: 12/11/21
 * Time: 7:40 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Demo {

    public static void main(String[] args) {
        Topic designPatternIntro = new Topic("Introduction to design pattern");

        Topic observer = new Topic("Observer pattern");
        observer.addLecture(new Lecture("intro-1"));
        observer.addLecture(new Lecture("intro-2"));

        Topic composite = new Topic("Composite pattern");
        composite.addLecture(new Lecture("intro-1"));
        composite.addLecture(new Lecture("intro-2"));

        Lecture finalIntro = new Lecture("Final introduction");

        designPatternIntro.addTopic(observer);
        designPatternIntro.addTopic(composite);
        designPatternIntro.addLecture(finalIntro);

        designPatternIntro.display("-");
    }
}

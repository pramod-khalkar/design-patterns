package org.patterns.structural.composite.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 12/11/21
 * Time: 7:33 am
 * This file is project specific to Groundplay
 * Author: Pramod Khalkar
 */
public class Topic {
    private List<Lecture> lectures = new ArrayList<>();
    private List<Topic> topics = new ArrayList<>();

    private String name;

    public Topic(String name) {
        this.name = name;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void display(String indentLevel) {
        System.out.println(indentLevel + this.name);
        lectures.forEach(lecture -> lecture.display(indentLevel + indentLevel));
        topics.forEach(topic -> topic.display(indentLevel + indentLevel));
    }
}

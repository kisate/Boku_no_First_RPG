package com.company;

import java.util.LinkedList;

/**
 * Created by student3on 26.01.17.
 */
public class Scene {
    String name, description;

    public Scene(String name, String description) {
        this.name = name;
        this.description = description;
    }

    LinkedList<Event> events = new LinkedList<Event>();
}

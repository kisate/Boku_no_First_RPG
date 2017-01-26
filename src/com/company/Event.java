package com.company;

/**
 * Created by student3 on 26.01.17.
 */
public abstract class Event {
    int effect;
    String description;

    public Event(int effect) {
        this.effect = effect;
    }

    void Run() {}
}

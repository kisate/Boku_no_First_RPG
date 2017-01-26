package com.company;

/**
 * Created by student3 on 26.01.17.
 */
public class Ev_Gold extends Event {
    public Ev_Gold(int effect) {
        super(effect);
    }

    @Override
    void Run() {
        Player.gold += effect;
    }
}

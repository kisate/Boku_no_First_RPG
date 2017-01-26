package com.company;

/**
 * Created by student3 on 26.01.17.
 */
public class Ev_Mana extends Event {
    public Ev_Mana(int effect) {
        super(effect);
    }

    @Override
    void Run() {
        Player.mp += effect;
    }
}

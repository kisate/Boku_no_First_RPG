package com.company;

/**
 * Created by student3 on 26.01.17.
 */
public class Ev_Dmg extends Event{

    public Ev_Dmg(int effect) {
        super(effect);
    }

    @Override
    void Run() {
        Player.hp -= effect;
    }
}

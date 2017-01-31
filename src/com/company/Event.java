package com.company;

/**
 * Created by student3 on 26.01.17.
 */
public class Event {
    int hp, gold, mana;
    String description;

    public Event(int mana, int hp, int gold, String description) {
        this.hp = hp;
        this.gold = gold;
        this.mana = mana;
        this.description = description;
    }

    void Run() {
        Player.hp += hp;
        Player.mp += mana;
        Player.gold += gold;
    }
}

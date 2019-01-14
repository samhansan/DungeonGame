package com.anyonganyong.app.Cards;

public class MonsterCard extends Card {
    private String name;
    private int health;
    private int attack;
    private int armor;
    private int gold;

    public MonsterCard(String name, int health, int attack, int armor, int gold) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
        this.gold = gold;
    }

    @Override
    public String getName() {
        return name;
    }
    public int getHealth() { return health; }
    public int getAttack() {
        return attack;
    }
    public int getArmor() { return armor; }
    public int getGold() { return gold; }
}

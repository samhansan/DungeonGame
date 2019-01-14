package com.anyonganyong.app.Characters;

public abstract class Character {
    String name;
    int health;
    int attack;
    int armor;

    public String getName() { return name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }
    public int getArmor() { return armor; }
    public void setArmor(int armor) { this.armor = armor; }

    public boolean isAlive() { return (health > 0); }
}

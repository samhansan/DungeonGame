package com.anyonganyong.app.Characters;

public class Hero extends Character {
    private String heroClass;

    public Hero(String name) {
        this.name = name;
    }

    public String getHeroClass() { return heroClass; }
    public void setHeroClass(String heroClass) { this.heroClass = heroClass; }
}

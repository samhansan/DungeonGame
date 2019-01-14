package com.anyonganyong.app.Characters;

public class HeroBuilder {
    private Hero newHero;

    public HeroBuilder(String name) {
        newHero = new Hero(name);
    }

    public HeroBuilder heroClass(String heroClass) {
        newHero.setHeroClass(heroClass);
        return this;
    }

    public HeroBuilder health(int health) {
        newHero.setHealth(health);
        return this;
    }

    public HeroBuilder attack(int attack) {
        newHero.setAttack(attack);
        return this;
    }

    public HeroBuilder armor(int armor) {
        newHero.setArmor(armor);
        return this;
    }

    public Hero build() {
        return newHero;
    }
}

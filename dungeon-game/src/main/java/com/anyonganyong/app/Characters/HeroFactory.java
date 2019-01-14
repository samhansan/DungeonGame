package com.anyonganyong.app.Characters;

public class HeroFactory {

    public static Hero createHero(String name, String heroClass) {
        int health;
        int attack;
        int armor;
        switch(heroClass) {
            case "Mage":
                health = 5;
                attack = 2;
                armor = 0;
                break;
            case "Barbarian":
                health = 10;
                attack = 3;
                armor = 0;
                break;
            case "Hunter":
                health = 7;
                attack = 2;
                armor = 1;
                break;
            case "Warrior":
            default:
                health = 8;
                attack = 2;
                armor = 2;
        }
        HeroBuilder newHeroBuilder = new HeroBuilder(name);
        return newHeroBuilder.heroClass(heroClass).health(health).attack(attack).armor(armor).build();
    }
}

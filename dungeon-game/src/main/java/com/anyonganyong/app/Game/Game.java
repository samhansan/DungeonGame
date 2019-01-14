package com.anyonganyong.app.Game;

import com.anyonganyong.app.Cards.MonsterCard;
import com.anyonganyong.app.Cards.Card;
import com.anyonganyong.app.Characters.Hero;
import com.anyonganyong.app.Characters.HeroFactory;
import com.anyonganyong.app.Characters.Monster;
import com.anyonganyong.app.Decks.Deck;
import com.anyonganyong.app.Decks.MonsterDrawDeck;
import com.anyonganyong.app.Decks.MonsterDrawDeckFactory;

public class Game {
    public Game() {
        Hero hero = HeroFactory.createHero("Anyong", "Warrior");
        Deck deck = MonsterDrawDeckFactory.createDeckType("Test");
        Card currCard = null;
        Monster currMonster = null;

        while ((deck.getSize() > 0) && (hero.isAlive())) {
            if (currMonster == null) {
                currCard = drawCard(deck);
                if (currCard instanceof MonsterCard) {
                    System.out.println("Drew a "+currCard.getName()+"!");
                    currMonster = new Monster((MonsterCard) currCard);
                    System.out.println(currMonster.getName()+": "+
                            currMonster.getHealth()+" HP / "+currMonster.getAttack()+" ATK / "+currMonster.getArmor()+" DEF");
                }
            }

            System.out.println(hero.getName()+"("+hero.getHeroClass()+"): "+
                    hero.getHealth()+" HP / "+hero.getAttack()+" ATK / "+hero.getArmor()+" DEF");

            int dmgA = hero.getAttack() - currMonster.getArmor();
            if (dmgA < 0) { dmgA = 0; }
            currMonster.setHealth(currMonster.getHealth() - dmgA);
            if (currMonster.getArmor() > 0) { currMonster.setArmor(currMonster.getArmor() - 1); }
            System.out.println("Did "+dmgA+" damage!");
            System.out.println(currMonster.getName()+": "+
                    currMonster.getHealth()+" HP / "+currMonster.getAttack()+" ATK / "+currMonster.getArmor()+" DEF");
            if (currMonster.isAlive()) {
                int dmgB = currMonster.getAttack() - hero.getArmor();
                if (dmgB < 0) { dmgB = 0; }
                hero.setHealth(hero.getHealth() - dmgB);
                if (hero.getArmor() > 0) { hero.setArmor(hero.getArmor()-1); }
                System.out.println("Took "+dmgB+" damage!");
            }
            else {
                System.out.println(currMonster.getName()+" died!");
                currMonster = null;
            }
        }
        if (!hero.isAlive()) {
            System.out.println("You lost :(");
            System.out.println("There were "+deck.getSize()+" cards left");
        }
        else {
            System.out.println("You won!");
        }
    }

    private Card drawCard(Deck deck) {
        return deck.drawTopCard();
    }
}

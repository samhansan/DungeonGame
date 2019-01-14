package com.anyonganyong.app.Decks;

import com.anyonganyong.app.Cards.Card;
import com.anyonganyong.app.Cards.MonsterCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterDrawDeckFactory {
    public static MonsterDrawDeck createDeckType(String deckType) {
        List<Card> cardsList = new ArrayList<>();
        switch(deckType) {
            case "Test":
                cardsList.add(new MonsterCard("Goblin", 2, 1, 0, 10));
                cardsList.add(new MonsterCard("Goblin", 2, 1, 0, 10));
                cardsList.add(new MonsterCard("Orc", 4, 2, 1, 20));
                cardsList.add(new MonsterCard("Orc", 4, 2, 1, 20));
                cardsList.add(new MonsterCard("Ghost", 4, 3, 0, 30));
                cardsList.add(new MonsterCard("Ghost", 4, 3, 0, 30));
                cardsList.add(new MonsterCard("Witch", 6, 3, 0, 40));
                cardsList.add(new MonsterCard("Witch", 6, 3, 0, 40));
                break;
            case "Standard":
            default:
                cardsList.add(new MonsterCard("Goblin", 2, 1, 0, 10));
                cardsList.add(new MonsterCard("Goblin", 2, 1, 0, 10));
                cardsList.add(new MonsterCard("Orc", 4, 2, 1, 20));
                cardsList.add(new MonsterCard("Orc", 4, 2, 1, 20));
                cardsList.add(new MonsterCard("Ghost", 4, 3, 0, 30));
                cardsList.add(new MonsterCard("Ghost", 4, 3, 0, 30));
                cardsList.add(new MonsterCard("Witch", 6, 3, 0, 40));
                cardsList.add(new MonsterCard("Witch", 6, 3, 0, 40));
                cardsList.add(new MonsterCard("Golem", 5, 2, 2, 50));
                cardsList.add(new MonsterCard("Golem", 5, 2, 2, 50));
                cardsList.add(new MonsterCard("Reaper", 9, 5, 0, 60));
                cardsList.add(new MonsterCard("Demon", 12, 4, 2, 80));
                cardsList.add(new MonsterCard("Dragon", 15, 4, 3, 100));
        }
        return createDeck(cardsList);
    }

    private static MonsterDrawDeck createDeck(List<Card> cardsList) {
        MonsterDrawDeck monsterDrawDeck = new MonsterDrawDeck();
        while(cardsList.size() > 0) {
            int index = new Random().nextInt(cardsList.size());
            MonsterCard monsterCard = (MonsterCard) cardsList.get(index);
            monsterDrawDeck.addToDeck(monsterCard);
            cardsList.remove(index);
        }
        return monsterDrawDeck;
    }
}

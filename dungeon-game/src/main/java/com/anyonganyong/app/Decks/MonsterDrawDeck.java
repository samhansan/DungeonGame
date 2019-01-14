package com.anyonganyong.app.Decks;

import com.anyonganyong.app.Cards.Card;
import com.anyonganyong.app.Cards.MonsterCard;

import java.util.Stack;

public class MonsterDrawDeck extends Deck {
    private Stack<MonsterCard> monsterDeck;

    public MonsterDrawDeck() {
        monsterDeck = new Stack<MonsterCard>();
    }

    @Override
    public int getSize() {
        return monsterDeck.size();
    }

    @Override
    public Card drawTopCard() {
        return monsterDeck.pop();
    }

    @Override
    public void addToDeck(Card card) {
        monsterDeck.push((MonsterCard) card);
    }
}

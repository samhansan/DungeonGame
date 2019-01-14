package com.anyonganyong.app.Decks;

import com.anyonganyong.app.Cards.Card;

import java.util.Stack;

public class PlayDeck extends Deck {
    private Stack<Card> playDeck;

    public PlayDeck() {
        playDeck = new Stack<Card>();
    }

    @Override
    public int getSize() {
        return playDeck.size();
    }

    @Override
    public Card drawTopCard() {
        return playDeck.pop();
    }

    @Override
    public void addToDeck(Card card) {
        playDeck.push(card);
    }
}

package com.anyonganyong.app.Decks;

import com.anyonganyong.app.Cards.Card;

public abstract class Deck {
    public abstract int getSize();
    public abstract Card drawTopCard();
    public abstract void addToDeck(Card card);
}

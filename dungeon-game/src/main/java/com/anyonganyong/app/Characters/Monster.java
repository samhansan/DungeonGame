package com.anyonganyong.app.Characters;

import com.anyonganyong.app.Cards.MonsterCard;

import java.util.List;
import java.util.LinkedList;

public class Monster extends Character {
    private int gold;
    private List<Object> itemDrops = new LinkedList<>();

    public Monster(MonsterCard monsterCard) {
        this.name = monsterCard.getName();
        this.health = monsterCard.getHealth();
        this.attack = monsterCard.getAttack();
        this.armor = monsterCard.getArmor();
    }

    public List<Object> getItemDrops() { return itemDrops; }
    public void addItemDrop(Object item) { itemDrops.add(item); }
}

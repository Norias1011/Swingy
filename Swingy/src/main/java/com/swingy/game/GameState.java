package com.swingy.game;

import com.swingy.Model.Hero;
import com.swingy.Model.Villain;

import java.util.List;

public class GameState {
    private Hero hero;
    private char[][] map;
    private List<Villain> villains;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public char[][] getMap() {
        return map;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    public List<Villain> getVillains() {
        return villains;
    }

    public void setVillains(List<Villain> villains) {
        this.villains = villains;
    }
}

package com.tipalol.patterns.factory;

import com.tipalol.patterns.factory.enemies.IEnemy;
import com.tipalol.patterns.factory.enemies.Lion;
import com.tipalol.patterns.factory.enemies.Mouse;
import com.tipalol.patterns.factory.enemies.Wolf;

import java.util.ArrayList;

public class Factory {
    private ArrayList<IEnemy> enemies = new ArrayList<IEnemy>();
    public ArrayList<IEnemy> getEnemies() {
        return enemies;
    }

    private Game.difficulty difficulty;

    public Factory(Game.difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public IEnemy createEnemy() {
        switch (difficulty) {
            case EASY:
                Mouse mouse = new Mouse();
                enemies.add(mouse);
                return mouse;
            case MEDIUM:
                Wolf wolf = new Wolf();
                enemies.add(wolf);
                return wolf;
            case HIGH:
                Lion lion = new Lion();
                enemies.add(lion);
                return lion;
            default:
                return null;
        }
    }
}

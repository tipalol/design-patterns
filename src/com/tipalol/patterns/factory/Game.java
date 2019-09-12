package com.tipalol.patterns.factory;

import com.tipalol.patterns.factory.enemies.IEnemy;

public class Game {

    protected enum difficulty {
        EASY,
        MEDIUM,
        HIGH,
    }

    private difficulty difficulty;

    private Factory factory;

    public Game(difficulty difficulty) {
        this.difficulty = difficulty;

        factory = new Factory(difficulty);
    }

    public IEnemy createNewEnemy() {
        return factory.createEnemy();
    }

}

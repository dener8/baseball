package main;

import main.Number;
import main.NumberMaker;

public class Player {
    private Number playerNumber;
    private NumberMaker numberMaker;

    public Player() {
        numberMaker = new NumberMaker();
        playerNumber = numberMaker.generatePlayerNumber();
    }

    public Number getPlayerNumber() {
        return playerNumber;
    }

}

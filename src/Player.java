import java.util.Scanner;

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

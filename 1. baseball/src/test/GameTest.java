package test;

import main.Game;
import main.Number;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @DisplayName("1스트라이크 0볼")
    @Test
    void oneStrikeZeroBall() {
        Game game = new Game();
        Number playerNumber = new Number("123");
        Number computerNumber = new Number("145");

        game.judgeThreeStrikes(playerNumber, computerNumber);
        Assertions.assertEquals("1스트라이크 0볼", game.getMessage());
    }

    @DisplayName("0스트라이크 2볼")
    @Test
    void zeroStrikeTwoBall() {
        Game game = new Game();
        Number playerNumber = new Number("123");
        Number computerNumber = new Number("214");

        game.judgeThreeStrikes(playerNumber, computerNumber);
        Assertions.assertEquals("0스트라이크 2볼", game.getMessage());
    }

    @DisplayName("3스트라이크 0볼")
    @Test
    void threeStrike() {
        Game game = new Game();
        Number playerNumber = new Number("123");
        Number computerNumber = new Number("123");

        game.judgeThreeStrikes(playerNumber, computerNumber);
        Assertions.assertEquals("3스트라이크 0볼", game.getMessage());
    }

    @DisplayName("낫싱")
    @Test
    void nothing() {
        Game game = new Game();
        Number playerNumber = new Number("123");
        Number computerNumber = new Number("456");

        game.judgeThreeStrikes(playerNumber, computerNumber);
        Assertions.assertEquals("낫싱", game.getMessage());
    }

}
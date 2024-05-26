package main;

import main.message.GuideMessage;

public class Game {
    private Computer computer;
    private NumberValidator numberValidator;
    private NumberMaker numberMaker;
    private String message;

    public Game() {
        computer = new Computer();
        numberValidator = new NumberValidator();
        numberMaker = new NumberMaker();
    }

    public void start() {
        System.out.println(GuideMessage.GAME_START);
        boolean isContinue = true;
        while (isContinue) {
            playOneGame();
            isContinue = askRestartOrNot();
        }
    }

    private void playOneGame() {
        Number computerNumber = computer.getComputerNumber();
        Number playerNumber;
        while (true) {
            System.out.println(GuideMessage.NUMBER_ENTER);
            playerNumber = numberMaker.generatePlayerNumber();
            if (!numberValidator.validatePlayerNumber(playerNumber)) {
                System.out.println(GuideMessage.NUMBER_INVALID);
                continue;
            }
            if (judgeThreeStrikes(playerNumber, computerNumber)) {
                break;
            }
        }
    }

    private boolean askRestartOrNot() {
        System.out.println(GuideMessage.ENTER_RESTART);
        Number restartNumber = numberMaker.generatePlayerNumber();
        if (!"1".equals(restartNumber.toString())) {
            System.out.println(GuideMessage.GAME_EXIT);
            return false;
        }
        System.out.println(GuideMessage.GAME_RESTART);
        computer = new Computer();
        return true;
    }

    public boolean judgeThreeStrikes(Number playerNumber, Number computerNumber) {
        int strikeCnt = 0;
        int ballCnt = 0;
        for (int i = 0; i < 3; i++) {
            if (playerNumber.getCharAt(i) == computerNumber.getCharAt(i)) {
                strikeCnt++;
            } else if (computerNumber.contains(String.valueOf(playerNumber.getCharAt(i)))) {
                ballCnt++;
            }
        }
        if (isNothing(strikeCnt, ballCnt)) {
            message = String.valueOf(GuideMessage.NOTHING);
            System.out.println(message);
            return false;
        }
        message = GuideMessage.RESULT_MESSAGE.format(strikeCnt, ballCnt);
        System.out.println(message);
        return strikeCnt == 3;
    }

    private boolean isNothing(int strikeCnt, int ballCnt) {
        return strikeCnt == 0 && ballCnt == 0;
    }

    public String getMessage() {
        return message;
    }
}

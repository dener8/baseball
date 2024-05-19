import message.GuideMessage;

public class Game {
    private Computer computer;
    private NumberValidator numberValidator;
    private NumberMaker numberMaker;

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

    private boolean judgeThreeStrikes(Number playerNumber, Number computerNumber) {
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
            System.out.println(GuideMessage.NOTHING);
            return false;
        }
        System.out.println(GuideMessage.RESULT_MESSAGE.format(strikeCnt, ballCnt));
        return strikeCnt == 3;
    }

    private boolean isNothing(int strikeCnt, int ballCnt) {
        return strikeCnt == 0 && ballCnt == 0;
    }
}

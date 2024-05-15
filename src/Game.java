public class Game {
    private Computer computer;
    private Player player;
    private NumberValidator numberValidator;

    public Game() {
        computer = new Computer();
        player = new Player();
        numberValidator = new NumberValidator();
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
        String answer = computer.getAnswer();
        String number;
        while (true) {
            System.out.println(GuideMessage.NUMBER_ENTER);
            number = player.enterNumber();
            if (!numberValidator.validatePlayerNumber(number)) {
                System.out.println(GuideMessage.NUMBER_INVALID);
                continue;
            }
            if (judgeThreeStrikes(number, answer)) {
                break;
            }
        }
    }

    private boolean askRestartOrNot() {
        System.out.println(GuideMessage.ENTER_RESTART);
        String restartNumber = player.enterNumber();
        if (!"1".equals(restartNumber)) {
            System.out.println(GuideMessage.GAME_EXIT);
            return false;
        }
        System.out.println(GuideMessage.GAME_RESTART);
        computer = new Computer();
        return true;
    }

    private boolean judgeThreeStrikes(String number, String answer) {
        int strikeCnt = 0;
        int ballCnt = 0;
        for (int i = 0; i < 3; i++) {
            if (number.charAt(i) == answer.charAt(i)) {
                strikeCnt++;
            } else if (answer.contains(String.valueOf(number.charAt(i)))) {
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

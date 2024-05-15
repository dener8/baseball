public class Game {
    private Computer computer;
    private Player player;

    public Game() {
        computer = new Computer();
        player = new Player();
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
            if (!validateNumber(number)) {
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

    private boolean validateNumber(String number) {
        return isThreeDigits(number)
                && isNumber(number)
                && isDifferentNumbers(number);
    }

    private boolean isThreeDigits(String number) {
        return number.length() == 3;
    }

    private boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isDifferentNumbers(String number) {
        return number.charAt(0) != number.charAt(1)
                && number.charAt(1) != number.charAt(2)
                && number.charAt(0) != number.charAt(2);
    }
}

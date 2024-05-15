import java.util.Random;

public class Computer {
    private String answer;
    private Random random;

    public Computer() {
        random = new Random();
        answer = generateAnswer();
    }

    public String getAnswer() {
        return answer;
    }

    public String generateAnswer() {
        return generateRandomNumber();
    }

    private String generateRandomNumber() {
        String randomNumber;
        do {
            randomNumber = String.valueOf(random.nextInt(900) + 100);
        } while (!validateNumber(randomNumber));

        return randomNumber;
    }

    private boolean validateNumber(String number) {
        if (number.charAt(0) == number.charAt(1)
            || number.charAt(1) == number.charAt(2)
            || number.charAt(0) == number.charAt(2)) {
            return false;
        }
        return true;
    }
}

import java.util.Random;

public class Computer {
    private String answer;
    private Random random;
    private NumberValidator numberValidator;

    public Computer() {
        random = new Random();
        numberValidator = new NumberValidator();
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
        } while (!numberValidator.validatePlayerNumber(randomNumber));

        return randomNumber;
    }
}

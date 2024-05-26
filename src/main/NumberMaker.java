package main;

import java.util.Random;
import java.util.Scanner;

public class NumberMaker {

    private Scanner scanner;
    private Number number; // final 여부 고민중
    private NumberValidator numberValidator;
//    private NumberInputManager numberInputManager;

    public NumberMaker() {
        scanner = new Scanner(System.in);
        numberValidator = new NumberValidator();
//        numberInputManager = new NumberInputManager();
    }

    public Number generateComputerNumber() {
        return generateRandomNumber();
    }

    public Number generatePlayerNumber() {
        String inputNumber = scanner.next();
        return new Number(inputNumber); // Number의 생성자와 연관지어 생각할 것 (과연 옳은가)
    }

    private Number generateRandomNumber() {
        Number randomNumber;
        Random random = new Random();
        do {
            randomNumber = new Number(new NumberUnit(random.nextInt(9) + 1)
                                    , new NumberUnit(random.nextInt(9) + 1)
                                    , new NumberUnit(random.nextInt(9) + 1));
        } while (!numberValidator.validateComputerNumber(randomNumber));

        return randomNumber;
    }

}

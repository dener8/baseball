package main;

public class Computer {
    private Number computerNumber;
    private NumberMaker numberMaker;

    public Computer() {
        numberMaker = new NumberMaker();
        computerNumber = numberMaker.generateComputerNumber();
    }

    public Number getComputerNumber() {
        return computerNumber;
    }

}

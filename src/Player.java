import java.util.Scanner;

public class Player {
    private String number;

    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public String getNumber() {
        return number;
    }

    public String enterNumber() {
        number = scanner.nextLine();
        return number;
    }

}

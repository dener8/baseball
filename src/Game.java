import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {

    Computer computer;
    public void start() {
        try {
            Scanner sc = new Scanner(System.in);
            computer = new Computer();
            int number = sc.nextInt();
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

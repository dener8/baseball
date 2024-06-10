import exception.InvalidNumberException;
import shape.Line;
import shape.Point;
import shape.Rectangle;
import shape.Triangle;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates();
        List<Point> points = null;
        String userInput;

        Scanner sc = new Scanner(System.in);

        while (points == null) {
            userInput = sc.next();

            try {
                points = coordinates.extractPointList(userInput);
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        int pointsCnt = points.size();

        /*
        이렇게 하면 하드코딩 되어버림. 수정 필요 (cf. 전략패턴)
         */
        if (pointsCnt == 2) {
            System.out.println(new Line(points).calculateLength(points.get(0), points.get(1)));
        } else if (pointsCnt == 3) {
            System.out.println(new Triangle(points).calculateArea());
        } else if (pointsCnt == 4) {
            System.out.println(new Rectangle(points).calculateArea());
        }
    }
}
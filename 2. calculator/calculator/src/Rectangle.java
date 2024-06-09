import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rectangle extends TwoDemensionalShape {

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    double calculateArea() {
        return calculateRectangleArea(points);
    }

    private double calculateRectangleArea(List<Point> points) {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        for (Point point : points) {
            xSet.add(point.getX());
            ySet.add(point.getY());
        }

        List<Integer> xList = new ArrayList<>(xSet);
        List<Integer> yList = new ArrayList<>(ySet);

        return Math.sqrt(Math.pow(xList.get(0) - xList.get(1), 2))
                - Math.sqrt(Math.pow(yList.get(0) - yList.get(1), 2));
    }
}

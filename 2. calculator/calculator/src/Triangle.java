import java.util.List;

public class Triangle extends TwoDemensionalShape {

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    double calculateArea() {
        return calculateTriangleArea(points);
    }

    /*
     헤론의 공식
     √s * (s - a) * (s - b) * (s - c)
     (s = (a + b + c) / 2)
     */
    private double calculateTriangleArea(List<Point> points) {
        Point pointA = points.get(0);
        Point pointB = points.get(1);
        Point pointC = points.get(2);

        double lengthAtoB = calculateLength(pointA, pointB);
        double lengthBtoC = calculateLength(pointB, pointC);
        double lengthAtoC = calculateLength(pointA, pointC);

        double s = (lengthAtoB + lengthBtoC + lengthAtoC) / 2;

        return Math.sqrt(s * (s - lengthAtoB) * (s - lengthBtoC) * (s - lengthAtoC));
    }
}

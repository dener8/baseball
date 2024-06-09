package shape;

import java.util.List;

public abstract class TwoDemensionalShape extends Shape {

    public TwoDemensionalShape(List<Point> points) {
        super(points);
    }

    public abstract double calculateArea();

}

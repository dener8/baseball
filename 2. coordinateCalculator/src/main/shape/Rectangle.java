package main.shape;

import java.util.*;

public class Rectangle extends TwoDemensionalShape {

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public double calculateArea() {
        return calculateRectangleArea(points);
    }

    private double calculateRectangleArea(List<Point> points) {

        /*
        특정 한 점에서 다른 세 점까지의 거리를 구한 뒤,
        길이가 작은 두 값의 곱이 사각형의 넓이
         */
        List<Double> candidates = new ArrayList<>();
        Point flagPoint = points.get(0);

        for (int i = 1; i < 4; i++) {
            candidates.add(calculateLength(flagPoint, points.get(i)));
        }
        Collections.sort(candidates);

        return candidates.get(0) * candidates.get(1);
    }
}

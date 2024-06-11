package main.shape;

import java.util.List;

/*
main.shape.Line, main.shape.Triangle, main.shape.Rectangle
 */
public abstract class Shape {

    List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public double calculateLength(Point pointA, Point pointB) {
        return Math.sqrt(
                Math.pow(pointA.getX() - pointB.getX(), 2)
                + Math.pow(pointA.getY() - pointB.getY(), 2)
                );
    }
}

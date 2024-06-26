package main.shape;

import main.exception.InvalidNumberException;
import main.view.Message;

public class Point {
    int x, y;

    public Point(int x, int y) throws InvalidNumberException {
        if (x < 0 || x > 24 || y < 0 || y > 24) {
            throw new InvalidNumberException(Message.OUT_OF_RANGE_INPUT);
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "main.shape.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

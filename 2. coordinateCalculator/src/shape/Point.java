package shape;

import exception.InvalidNumberException;
import view.Message;

public class Point {
    int x, y;

    public Point(int x, int y) throws InvalidNumberException {
        if (x < 0 || x > 24 || y < 0 || y > 24) {
            throw new InvalidNumberException(Message.INVALID_INPUT);
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
        return "shape.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

package test;

import main.exception.InvalidNumberException;
import main.shape.Point;
import main.shape.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleTest {

    private List<Point> points;

    @BeforeEach
    void beforeEach() {
        points = new ArrayList<>();
    }

    @DisplayName("(0,0)-(4,0)-(0,4)-(4,4) => 사각형 넓이 16.0")
    @Test
    void calculateRectangleArea() throws InvalidNumberException {
        Collections.addAll(points, new Point(0, 0), new Point(4, 0), new Point(0, 4), new Point(4, 4));

        Assertions.assertEquals(16.0, new Rectangle(points).calculateArea());
    }
}

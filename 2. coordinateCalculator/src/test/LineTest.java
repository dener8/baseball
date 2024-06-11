package test;

import main.exception.InvalidNumberException;
import main.shape.Line;
import main.shape.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineTest {

    private List<Point> points;

    @BeforeEach
    void beforeEach() {
        points = new ArrayList<>();
    }

    @DisplayName("(0,0)-(4,0) => 직선 길이 4.0")
    @Test
    void calculateRectangleArea() throws InvalidNumberException {
        Collections.addAll(points, new Point(0, 0), new Point(4, 0));

        Assertions.assertEquals(4.0, new Line(points).calculateLength(points.get(0), points.get(1)));
    }
}

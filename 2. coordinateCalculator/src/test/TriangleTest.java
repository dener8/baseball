package test;

import main.exception.InvalidNumberException;
import main.shape.Point;
import main.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TriangleTest {

    private List<Point> points;

    @BeforeEach
    void beforeEach() {
        points = new ArrayList<>();
    }

    @DisplayName("(0,0)-(4,0)-(0,4) => 삼각형 넓이 8.0")
    @Test
    void calculateTriangleArea() throws InvalidNumberException {
        Collections.addAll(points, new Point(0, 0), new Point(4, 0), new Point(0, 4));

        // 헤론의 공식 오차 발생 가능성 처리 (0.001 오차 가능)
        Assertions.assertEquals(8.0, new Triangle(points).calculateArea(), 0.001);
    }
}
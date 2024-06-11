package main;

import main.exception.InvalidNumberException;
import main.shape.Point;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

    /*
    1. '-' 제거
    2. '(', ')' 제거
    3. ',' 제거
     */
    public List<Point> extractPointList(String coordinates) throws InvalidNumberException {
        List<Point> points = new ArrayList<>();

        String[] parts = coordinates.split("-");
        for (String part : parts) {
            String[] xy = part.replace("(","").replace(")", "").trim().split(",");
            Point point = new Point(Integer.parseInt(xy[0].trim()), Integer.parseInt(xy[1].trim()));
            points.add(point);
        }

        return points;
    }




}

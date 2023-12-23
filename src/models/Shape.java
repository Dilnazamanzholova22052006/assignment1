package models;
import java.util.ArrayList;
import java.util.Arrays;
public class Shape {
    public ArrayList<Point> points = new ArrayList<>();

    public ArrayList<Point> getPoints(){
        return points;
    }

    public void addPoint(Point point){
        points.add(point);
    }
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += current.distance(next);
        }
        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            double distance = current.distance(next);
            longestSide = Math.max(longestSide, distance);
        }
        return longestSide;
    }
    public double getAverageSide() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size());
            perimeter += current.distance(next);
        }
        return perimeter / points.size();
    }
}



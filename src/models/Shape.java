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
    double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++) {
            Point current = points[i];
            Point next = points[(i + 1)];
            perimeter += current.distance(next);
        }
            return perimeter;
        }
    }
    double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.length; i++) {
            Point current = points[i];
            Point next = points[(i + 1)];
            double distance = current.distance(next);
            longestSide = Math.max(longestSide, distance);
        }
        return longestSide;
    }
    double getAverageSide() {
        double averageSide = 0;
        for (int i = 0; i < points.length; i++) {
            Point current = points[i];
            Point next = points[i + 1];
            perimeter += current.distance(next);
            averageSide = perimeter / points.length;
        }
        return averageSide;
    }
  

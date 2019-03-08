package by.javatr.task7.util;


import java.awt.*;

public class Task7Logic {
    final public static int SIZE = 2;
    private Point[] points = new Point[SIZE];
    private Point min = new Point();

    public Task7Logic(){
        for (int i = 0; i < SIZE; i++) {
            points[i] = new Point(0, 0);
        }
    }

    public void setPoints(int[] coordinates) {
        for(int i = 0; i < SIZE; i++) {
            points[i].x = coordinates[2 * i];
            points[i].y = coordinates[2 * i + 1];
        }
    }


    public void findNearestPoint() {
        Point min = new Point(points[0].x, points[0].y);
        for (Point p : points) {
            min = nearestPoint(p, min);
        }

        this.min = min;

    }

    private Point nearestPoint (Point a, Point b) {
        if (Math.hypot(a.x, a.y) <= Math.hypot(b.x, b.y)) return a;
        else return b;
    }

    public Point getMin() {
        return min;
    }
}

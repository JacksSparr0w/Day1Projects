package by.javatr.task9.util;

public class Task9Logic {
    private final static double PI = 3.14;
    private double radius;
    private double square;
    private double length;

    public Task9Logic() {
        //
    }

    public boolean setRadious(double radius) {
        if (radius > 0) {
            this.radius = radius;
            return true;
        }
        return false;
    }

    public void findSquare(){
        square = PI * Math.pow(radius, 2);
    }

    public void findLength(){
        length = 2 * PI * radius;
    }

    public double getLength() {
        return length;
    }

    public double getSquare() {
        return square;
    }
}

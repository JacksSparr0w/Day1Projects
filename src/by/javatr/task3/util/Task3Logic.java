package by.javatr.task3.util;

public class Task3Logic {

    private double bigSquare;
    private double circleRadius;
    private double littleSquare;
    private double divide;

    public Task3Logic () {
        //
    }

    public boolean setBigSquare(double bigSquare) {
        if (bigSquare > 0) {
            this.bigSquare = bigSquare;
            return true;
        }
        return false;
    }
    public void calculations() {
        circleRadius = Math.sqrt(bigSquare) / 2;
        littleSquare = circleRadius * circleRadius * 2;
        divide = bigSquare / littleSquare;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public double getLittleSquare() {
        return littleSquare;
    }

    public double getDivide() {
        return divide;
    }

}

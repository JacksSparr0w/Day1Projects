package by.javatr.task10.util;

public class Task10Logic {
    private double a;
    private double b;
    private double h;
    private int size;
    private double[] x;
    private double[] y;

    public Task10Logic() {
        //
    }

    public void set(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
        initialization();
    }

    private void initialization(){
        size = (int)((b - a) / h) + 1;
        x = new double[size];
        y = new double[size];
    }
    public void loop() {
        double i;
        int j;
        for (i = a, j = 0; i <= b; i+=h, j++)
            function(i, j);
    }

    private void function(double x, int pos) {
        y[pos] = Math.tan(x);
        this.x[pos] = x;
    }

    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }
}

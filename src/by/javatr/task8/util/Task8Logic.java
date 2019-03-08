package by.javatr.task8.util;

import static java.lang.Math.*;

public class Task8Logic {
    private final int BORDER = 3;
    private double x;
    private double y;

    public Task8Logic() {
        x = 0;
        y = 0;
    }

    public void setX(double x){
        this.x = x;
    }

    public void findY() {
        if (x >= BORDER)
            fun1();
        else
            fun2();
    }

    private void fun1() {
        y = - pow(x, 2) + 3 * x + 9;
    }

    private void fun2() {
        y = pow(pow(x, 3) - 6, -1);
    }

    public double getY(){
        return y;
    }

}

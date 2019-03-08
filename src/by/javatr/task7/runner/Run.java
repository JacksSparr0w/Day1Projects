package by.javatr.task7.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task7.util.Task7Logic;

import java.awt.*;

import static by.javatr.task7.util.Task7Logic.SIZE;

public class Run {
    public static void main (String[] args) {
        int[] a = new int[SIZE*2];
        System.out.println("Введите координаты точек: ");
        for (int i = 0; i < SIZE * 2; i++) {
            a[i] = (int) EnterFromConsole.EnterDouble();
        }

        Task7Logic task7 = new Task7Logic();
        task7.setPoints(a);
        task7.findNearestPoint();
        Point A = task7.getMin();
        if (A == null)
            System.out.println("Точки находятся на одинаковом расстоянии от начала координат.");
        else
            System.out.print("Точка (" + A.x + ":" + A.y + ") ближе к началу координат");
    }
}

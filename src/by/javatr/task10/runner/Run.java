package by.javatr.task10.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task10.util.Task10Logic;

public class Run {
    public static void main (String[] args) {

        double a, b, h;
        System.out.println("Введите начало отрезка: ");
        a = EnterFromConsole.EnterDouble();
        System.out.println("Введите конец отрезка: ");
        b = EnterFromConsole.EnterDouble();
        System.out.println("Введите шаг: ");
        h = EnterFromConsole.EnterDouble();

        Task10Logic task10 = new Task10Logic();
        task10.set(a, b, h);
        task10.loop();

        System.out.format("%10s%10s%n", "Аргумент", "Значение");
        for (int i = 0; i < task10.getX().length; i++)
            System.out.format("%10.1f%10.3f%n", task10.getX()[i], task10.getY()[i]);


    }
}

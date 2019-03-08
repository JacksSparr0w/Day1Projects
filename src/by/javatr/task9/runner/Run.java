package by.javatr.task9.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task9.util.Task9Logic;

public class Run {
    public static void main(String[] args) {
        double radius;
        Task9Logic task9 = new Task9Logic();
        do {
            System.out.print("Введите радиус окружности: ");
            radius = EnterFromConsole.EnterDouble();
        }
        while (!task9.setRadious(radius));
        task9.findLength();
        task9.findSquare();
        System.out.format("Площадь окружности равна %.2f%n", task9.getSquare());
        System.out.format("Длина окружности равна %.2f%n", task9.getLength());
    }
}

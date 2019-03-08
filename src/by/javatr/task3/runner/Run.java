package by.javatr.task3.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task3.util.Task3Logic;

public class Run {

    public static void main (String[] args) {
        double number;
        Task3Logic task3 = new Task3Logic();
        do {
            System.out.print("Введите число: ");
            number = (int) EnterFromConsole.EnterDouble();
        }
        while (!task3.setBigSquare(number));

        task3.calculations();
        System.out.println("Площадь меньшего квадрата: " + task3.getLittleSquare());
        System.out.println("Площадь вписанного квадрата меньше площади заданного в " + task3.getDivide() + " раз");
    }
}

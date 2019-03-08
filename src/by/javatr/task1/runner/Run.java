package by.javatr.task1.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task1.util.Square;

public class Run {

    public static void main (String[] args) {
        Square square = new Square();
        System.out.print("Введите число: ");
        int number = (int) EnterFromConsole.EnterDouble();
        square.setNumber(number);
        square.findSquareOfLastNumber();

        System.out.println("Последняя цифра введенного числа: " + square.getLastNumber());
        System.out.println("Последняя цифра квадрата: " + square.getSquareLastNumber());

        return;
    }
}

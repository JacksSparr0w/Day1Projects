package by.javatr.task2.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task2.util.Task2Logic;

public class Run {
    public static void main(String[] arg) {
        int year, month;
        Task2Logic task2 = new Task2Logic();
        
        do {
            System.out.print("Введите год: ");
            year = (int) EnterFromConsole.EnterDouble();
        }
        while (!task2.setYear(year));

        do {
            System.out.print("Введите месяц: ");
            month = (int) EnterFromConsole.EnterDouble();
        }
        while (!task2.setMonth(month));

        task2.calculate();

        String leap;
        if (task2.getLeapYear())
            leap = "високосный";
        else
            leap = "не високосный";

        System.out.format("%d - %s год.%nВ %d месяце %d дней.", task2.getYear(), leap, task2.getMonth(), task2.getDaysInMonth());
    }
}

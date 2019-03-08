package by.javatr.task6.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task6.util.Task6Logic;

public class Run {

    public static void main (String[] args) {
        int seconds;
        Task6Logic task6 = new Task6Logic();

        do {
            System.out.print("Введите n-ую секунду суток: ");
            seconds = (int) EnterFromConsole.EnterDouble();
        }
        while (!task6.setSeconds(seconds));                 //task501.setNumber возвращает true если аргумент удовлетворяет условию.
        task6.findHoursAndMinutes();
        System.out.println("Кол-во полных часов: " + task6.getHour());
        System.out.println("Кол-во полных минут: " + task6.getMinute());
        System.out.println("Кол-во секунд: " + task6.getSeconds());

    }
}
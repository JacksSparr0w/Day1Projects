package by.javatr.task5.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task5.util.Task5Logic;

public class Run {

    public static void main (String[] args) {
        int number;
        Task5Logic task5 = new Task5Logic();
        do {
            System.out.print("Введите трезначное число: ");
            number = (int) EnterFromConsole.EnterDouble();
        }
        while (!task5.setNumber(number));                 //task501.setNumber возвращает true если аргумент удовлетворяет условию.
        task5.function();
        System.out.println("Вывод: " + task5.getFunction());
    }
}
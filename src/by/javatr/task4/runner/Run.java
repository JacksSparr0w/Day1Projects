package by.javatr.task4.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task4.util.Task4Logic;

public class Run {

    public static void main (String[] args) {
        int[] params = new int[Task4Logic.LENGTH];
        System.out.print("Введите числа: ");
        for (int i = 0; i < Task4Logic.LENGTH; i++)
            params[i] = (int) EnterFromConsole.EnterDouble();

        Task4Logic task4 = new Task4Logic();
        task4.setParams(params);
        task4.findFunction();
        System.out.print("Выход: " + task4.getFunction());

    }
}

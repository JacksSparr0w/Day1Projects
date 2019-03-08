package by.javatr.task8.runner;

import by.javatr.scanner.EnterFromConsole;
import by.javatr.task8.util.Task8Logic;

public class Run {
    public static void main(String[] arg){
        double x;
        Task8Logic task8 = new Task8Logic();
        System.out.print("Введите х: ");
        x = EnterFromConsole.EnterDouble();
        task8.setX(x);
        task8.findY();
        System.out.format("Значение функции равно %.3f", task8.getY());

    }
}

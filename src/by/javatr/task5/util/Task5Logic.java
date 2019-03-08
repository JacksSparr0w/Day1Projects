package by.javatr.task5.util;

import static java.lang.Math.pow;

public class Task5Logic {
    final static private int LENGTH = 3;
    private int number;
    private int[] numerals = new int[LENGTH];
    private boolean function;

    public Task5Logic() {
        //constructor
    }

    public boolean setNumber(int number) {
        if (number > 99 && number < 1000) {
            this.number = number;
            return true;
        }
        else return false;
    }

    private void findNumerals() {

        //цифры числа number
        String buf = Integer.toString(number);
        for (int i = 0; i < LENGTH; i++) {
            numerals[i] = (int) buf.charAt(i);
        }
    }

    public void function() {
        findNumerals();
        int sum = 0;
        for (int x : numerals) sum += x;
        if (pow(number, 2) == pow(sum, 3))
            function = true;
        else
            function = false;
    }

    public boolean getFunction() {
        return function;
    }

}

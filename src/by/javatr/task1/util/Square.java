package by.javatr.task1.util;

public class Square {
    private int number;
    private int lastNumber;
    private int squareLastNumber;

    public Square () {
        //
    }

    public void setNumber(int number) {
        this.number = number;

        while (number > 10) {
            number %= 10;
        }

        lastNumber = number;
    }

    //Находит последнюю цифру квадрата числа
    public void findSquareOfLastNumber () {
        squareLastNumber = (number * number) % 10;
    }

    public int getSquareLastNumber() {
        return squareLastNumber;
    }

    public int getLastNumber() {
        return lastNumber;
    }
}


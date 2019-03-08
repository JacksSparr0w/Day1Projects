package by.javatr.task2.util;

public class Task2Logic {
    //in
    private int year;
    private int month;

    //out
    private boolean leapYear;
    private int daysInMonth;

    //calculate
    private static int[] months31 = new int[] {31, 1, 3, 5, 7, 8, 10, 12};
    private static int[] months30 = new int[] {30, 4, 6, 9, 11};
    private static int[] month28 = new int[] {28, 2};
    private static int[] month29 = new int[] {29, 2};
    private int[][] allMonth = new int[3][];

    public Task2Logic() {
        this.year = 0;
        this.month = 0;
        leapYear = false;
        daysInMonth = 0;
    }

    private void isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            leapYear = true;
        else
            leapYear = false;
    }

    public boolean setYear(int year) {
        if (year >= 0) {
            this.year = year;
            return true;
        }
        return false;
    }

    public boolean setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
            return true;
        }
        return false;
    }

    public void calculate(){
        isLeapYear();
        if (leapYear)
            allMonth = new int[][]{months31, months30, month29};
        else
            allMonth = new int[][]{months31, months30, month28};
        for(int[] x : allMonth) {
            int days = find(x, month);
            if(days != 0)
                daysInMonth = days;
        }

    }

    private int find(int[] months, int month) {
        for (int i = 1; i < months.length; i++) {
            if (month == months[i])
                return months[0];
        }
        return 0;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public boolean getLeapYear(){
        return leapYear;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}

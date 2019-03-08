package by.javatr.task6.util;

public class Task6Logic {
    final static int HOUR = 3600;
    final static int MINUTE = 60;

    private int seconds;
    private int hours;
    private int minutes;

    public Task6Logic() {
        //constructor
        hours = 0;
        minutes = 0;
    }

    public boolean setSeconds(int seconds) {
        if (seconds > 0 && seconds <= HOUR * 24) {
            this.seconds = seconds;
            return true;
        }
        else
            return false;
    }

    public void findHoursAndMinutes() {
        hours = seconds / HOUR;
        seconds %= HOUR;
        minutes = seconds / MINUTE;
        seconds %= MINUTE;
    }

    public int getHour() { return hours; }

    public  int getMinute() { return minutes; }

    public int getSeconds() { return seconds; }

}

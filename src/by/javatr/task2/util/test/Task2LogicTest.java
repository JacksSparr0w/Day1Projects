package by.javatr.task2.util.test;

import by.javatr.task2.util.Task2Logic;
import org.junit.Assert;
import org.junit.Test;


public class Task2LogicTest {
    Task2Logic test2 = new Task2Logic();

    @Test
    public void Task2LogicTest1() {
        int year = 2012;
        int month = 2;
        test2.setYear(year);
        test2.setMonth(month);
        test2.calculate();
        boolean expectedLeap = true;
        int expectedDays = 29;
        boolean actualLeap = test2.getLeapYear();
        int actualDays = test2.getDaysInMonth();


        Assert.assertEquals(expectedLeap, actualLeap);
        Assert.assertEquals(expectedDays, actualDays);
    }

    @Test
    public void Task2LogicTest2() {
        int year = 2010;
        int month = 10;
        test2.setYear(year);
        test2.setMonth(month);
        test2.calculate();
        boolean expectedLeap = false;
        int expectedDays = 31;
        boolean actualLeap = test2.getLeapYear();
        int actualDays = test2.getDaysInMonth();


        Assert.assertEquals(expectedLeap, actualLeap);
        Assert.assertEquals(expectedDays, actualDays);
    }

    @Test
    public void Task2LogicTest3() {
        int year = 1600;
        int month = 2;
        test2.setYear(year);
        test2.setMonth(month);
        test2.calculate();
        boolean expectedLeap = true;
        int expectedDays = 29;
        boolean actualLeap = test2.getLeapYear();
        int actualDays = test2.getDaysInMonth();


        Assert.assertEquals(expectedLeap, actualLeap);
        Assert.assertEquals(expectedDays, actualDays);
    }

}
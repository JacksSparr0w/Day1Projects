import by.javatr.task9.util.Task9Logic;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task9LogicTest {
    Task9Logic test9 = new Task9Logic();

    @Test
    public void Task9LogicTest11() {
        double radius = 10;
        test9.setRadious(radius);
        test9.findSquare();

        double expected = 314.0;

        double actual = test9.getSquare();

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void Task9LogicTest12() {
        double radius = 10;
        test9.setRadious(radius);
        test9.findLength();

        double expected = 62.8;

        double actual = test9.getLength();

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void Task9LogicTest21() {
        double radius = 1;
        test9.setRadious(radius);
        test9.findSquare();

        double expected = 3.14;

        double actual = test9.getSquare();

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void Task9LogicTest22() {
        double radius = 1;
        test9.setRadious(radius);
        test9.findLength();

        double expected = 6.28;

        double actual = test9.getLength();

        Assert.assertEquals(expected, actual, 0.1);
    }

}
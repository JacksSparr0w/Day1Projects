import by.javatr.task7.util.Task7Logic;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class Task7LogicTest {
    Task7Logic test7 = new Task7Logic();

    @Test
    public void Task7LogicTest1() {
        int[] points = new int[] {1, 2, 3, 4};

        test7.setPoints(points);
        test7.findNearestPoint();
        Point expected = new Point(1, 2);
        Point actual = test7.getMin();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Task7LogicTest2() {
        int[] points = new int[] {0, 0, -3, -1};

        test7.setPoints(points);
        test7.findNearestPoint();
        Point expected = new Point(0, 0);
        Point actual = test7.getMin();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Task7LogicTest3() {
        int[] points = new int[] {1, 1, 2, 0};

        test7.setPoints(points);
        test7.findNearestPoint();
        Point expected = new Point(1, 1);
        Point actual = test7.getMin();

        Assert.assertEquals(expected, actual);
    }


}
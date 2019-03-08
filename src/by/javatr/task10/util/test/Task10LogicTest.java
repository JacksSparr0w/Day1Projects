import by.javatr.task10.util.Task10Logic;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task10LogicTest {
    Task10Logic test10 = new Task10Logic();

    @Test
    public void Task10LogicTest1(){
        int a = 1;
        int b = 5;
        int h = 1;
        test10.set(a, b, h);
        test10.loop();
        double[] expectedX = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualX = test10.getX();
        for (int i = 0; i < actualX.length; i++)
            Assert.assertEquals(expectedX[i], actualX[i], 0.1);
    }

    @Test
    public void Task10LogicTest2(){
        int a = 1;
        int b = 5;
        int h = 1;
        test10.set(a, b, h);
        test10.loop();
        double[] expectedY = new double[]{1.5, -2.1, -0.1, 1.1, -3.3};
        double[] actualY = test10.getY();
        for (int i = 0; i < actualY.length; ++i)
            Assert.assertEquals(expectedY[i], actualY[i], 0.1);
    }


}
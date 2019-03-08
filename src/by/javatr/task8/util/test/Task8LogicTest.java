import by.javatr.task8.util.Task8Logic;
import org.junit.Assert;
import org.junit.Test;

public class Task8LogicTest {
    Task8Logic test8 = new Task8Logic();

    @Test
    public void Task8LogicTest1(){
        double x = 3;
        test8.setX(x);
        test8.findY();
        double expected = 9.0;
        double actual = test8.getY();

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void Task8LogicTest2(){
        double x = 2;
        test8.setX(x);
        test8.findY();
        double expected = 0.5;
        double actual = test8.getY();

        Assert.assertEquals(expected, actual, 0.1);
    }

}
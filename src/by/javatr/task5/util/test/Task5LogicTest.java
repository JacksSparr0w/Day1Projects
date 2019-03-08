import by.javatr.task5.util.Task5Logic;
import org.junit.Assert;
import org.junit.Test;

public class Task5LogicTest {
    Task5Logic test5 = new Task5Logic();

    @Test
    public void Task5LogicTest1() {

        int number = 321;
        test5.setNumber(number);
        test5.function();
        boolean expected = false;
        boolean actual = test5.getFunction();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Task5LogicTest2() {

        int number = 189;
        test5.setNumber(number);
        test5.function();
        boolean expected = false;
        boolean actual = test5.getFunction();
        Assert.assertEquals(expected, actual);
    }

}
import by.javatr.task6.util.Task6Logic;
import org.junit.Assert;
import org.junit.Test;

public class Task6LogicTest {
    Task6Logic test6 = new Task6Logic();

    @Test
    public void Task6LogicTest1() {
        int AllSeconds = 0;

        test6.setSeconds(AllSeconds);
        test6.findHoursAndMinutes();

        int expectedHour = 0;
        int expectedMinute = 0;
        int expectedSeconds = 0;

        int actualHour = test6.getHour();
        int actualMinute = test6.getMinute();
        int actualSeconds = test6.getSeconds();

        Assert.assertEquals(expectedHour, actualHour);
        Assert.assertEquals(expectedMinute, actualMinute);
        Assert.assertEquals(expectedSeconds, actualSeconds);
    }

    @Test
    public void Task6LogicTest2() {
        int AllSeconds = 86400;

        test6.setSeconds(AllSeconds);
        test6.findHoursAndMinutes();

        int expectedHour = 24;
        int expectedMinute = 0;
        int expectedSeconds = 0;

        int actualHour = test6.getHour();
        int actualMinute = test6.getMinute();
        int actualSeconds = test6.getSeconds();

        Assert.assertEquals(expectedHour, actualHour);
        Assert.assertEquals(expectedMinute, actualMinute);
        Assert.assertEquals(expectedSeconds, actualSeconds);
    }

    @Test
    public void Task6LogicTest3() {
        int AllSeconds = 86398;

        test6.setSeconds(AllSeconds);
        test6.findHoursAndMinutes();

        int expectedHour = 23;
        int expectedMinute = 59;
        int expectedSeconds = 58;

        int actualHour = test6.getHour();
        int actualMinute = test6.getMinute();
        int actualSeconds = test6.getSeconds();

        Assert.assertEquals(expectedHour, actualHour);
        Assert.assertEquals(expectedMinute, actualMinute);
        Assert.assertEquals(expectedSeconds, actualSeconds);
    }

}
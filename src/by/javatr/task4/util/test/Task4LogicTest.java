import by.javatr.task4.util.Task4Logic;
import org.junit.Assert;
import org.junit.Test;

public class Task4LogicTest {

    Task4Logic test4 = new Task4Logic();

    @Test
    public void Task4LogicTest1() {

        int[] params = new int[]{1, 2, 3, 4};
        test4.setParams(params);
        test4.findFunction();
        boolean expected = true;
        boolean actual = test4.getFunction();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Task4LogicTest2() {

        int[] params = new int[]{1, 1, 1, 2};
        test4.setParams(params);
        test4.findFunction();
        boolean expected = false;
        boolean actual = test4.getFunction();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Task4LogicTest3() {

        int[] params = new int[]{0, 0, 1,-2, 0};
        test4.setParams(params);
        test4.findFunction();
        boolean expected = true;
        boolean actual = test4.getFunction();
        Assert.assertEquals(expected, actual);
    }

}
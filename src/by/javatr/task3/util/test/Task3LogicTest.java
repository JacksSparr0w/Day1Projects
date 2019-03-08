import by.javatr.task3.util.Task3Logic;
import org.junit.Assert;
import org.junit.Test;

public class Task3LogicTest {
    Task3Logic test3 = new Task3Logic();

    @Test
    public void Task2LogicTest1() {
        double bigSquare = 100;
        
        test3.setBigSquare(bigSquare);
        test3.calculations();
        
        double actualLittleSquare = test3.getLittleSquare();

        double expectedLittleSquare = 50;

        Assert.assertEquals(expectedLittleSquare, actualLittleSquare, 0.1);
    }

    @Test
    public void Task2LogicTest2() {
        double bigSquare = 100;

        test3.setBigSquare(bigSquare);
        test3.calculations();

        double actualDivide = test3.getDivide();

        double expectedDivide = 2;

        Assert.assertEquals(expectedDivide, actualDivide, 0.1);
    }

}
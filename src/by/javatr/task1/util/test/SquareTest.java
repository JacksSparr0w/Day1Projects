import by.javatr.task1.util.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    Square test1 = new Square();

    @Test
    public void findSquareOfLastNumberTest1() {
        int a = 10;
        test1.setNumber(a);
        test1.findSquareOfLastNumber();
        int expected = 0;
        int actual = test1.getSquareLastNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findSquareOfLastNumberTest2() {
        int a = 8;
        test1.setNumber(a);
        test1.findSquareOfLastNumber();
        int expected = 4;
        int actual = test1.getSquareLastNumber();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findSquareOfLastNumberTest3() {
        int a = 19;
        test1.setNumber(a);
        test1.findSquareOfLastNumber();
        int expected = 1;
        int actual = test1.getSquareLastNumber();
        Assert.assertEquals(expected, actual);
    }


}
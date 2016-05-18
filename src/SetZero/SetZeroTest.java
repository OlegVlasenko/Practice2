package SetZero;

import org.junit.Assert;
import org.junit.Test;

public class SetZeroTest {
    private SetZero SetZero = new SetZero();
    @Test
    public void SetZeroTest_1(){
        int input1 = 6;
        int input2 = 2;

        int expectedResult  = 4;

        int actualResult = SetZero.set(input1, input2);

        Assert.assertEquals("Error", expectedResult, actualResult);
    }
    @Test
    public void SetZeroTest_2(){
        int input1 = 3;
        int input2 = 1;

        int expectedResult  = 2;

        int actualResult = SetZero.set(input1, input2);

        Assert.assertEquals("Error", expectedResult, actualResult);
    }
}

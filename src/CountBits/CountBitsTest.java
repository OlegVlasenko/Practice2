package CountBits;

import org.junit.Assert;
import org.junit.Test;

public class CountBitsTest {
    private  CountBits CountBits = new CountBits();

    @Test
    public void CountBitsTest_1(){
        int input = 13;

        int actualResult = CountBits.count(input);
        int expectedResult = 3;

        Assert.assertEquals("Error", expectedResult, actualResult);
    }

    @Test
    public void CountBitsTest_2(){
        int input = -2147483647;

        int actualResult = CountBits.count(input);
        int expectedResult = 2;

        Assert.assertEquals("Error", expectedResult, actualResult);
    }

}

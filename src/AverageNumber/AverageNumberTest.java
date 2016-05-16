package AverageNumber;

import org.junit.Assert;
import org.junit.Test;

public class AverageNumberTest {

    private final AverageNumber AverageNumber = new AverageNumber();

    @Test
    public void AverageNumberTest_1(){
        int input1 = -4;
        int input2 = 7;

        int expectedResult = 1;

        int actualResult = AverageNumber.average(input1,input2);

        Assert.assertEquals("Error", expectedResult, actualResult );

    }
//Input: 1073741824, 1073741824
//    Expected: 1073741824
@Test
public void AverageNumberTest_2(){
    int input1 = 1073741824;
    int input2 = 1073741824;

    int expectedResult = 1073741824;

    int actualResult = AverageNumber.average(input1,input2);

    Assert.assertEquals("Error", expectedResult, actualResult );

}

}
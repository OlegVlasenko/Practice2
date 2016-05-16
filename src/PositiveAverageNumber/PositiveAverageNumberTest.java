package PositiveAverageNumber;

import org.junit.Assert;
import org.junit.Test;

public class PositiveAverageNumberTest {

    PositiveAverageNumber PositiveAverageNumber = new PositiveAverageNumber();

    @Test
    public void PositiveAverageNumberTest_1(){
        int input1 = 2;
        int input2 = 4;

        int expectedResult = 3;

        int actualResult = PositiveAverageNumber.average(input1,input2);


        Assert.assertEquals("Error", expectedResult, actualResult );

    }
    @Test
    public void PositiveAverageNumberTest_2(){
        int input1 = 4;
        int input2 = 7;

        int expectedResult = 5;

        int actualResult = PositiveAverageNumber.average(input1,input2);

        Assert.assertEquals("Error", expectedResult, actualResult );

    }

//    Input: 1073741824, 1073741824
//    Expected: 1073741824

    @Test
    public void PositiveAverageNumberTest_3(){

        int input1 = 1073741824;
        int input2 = 1073741824;

        int expectedResult = 1073741824;

        int actualResult = PositiveAverageNumber.average(input1,input2);

        Assert.assertEquals("Error", expectedResult, actualResult );

    }
//2147483647
@Test
public void PositiveAverageNumberTest_4(){
    int input1 = 2147483647;
    int input2 = 2147483647;

    int expectedResult = 2147483647;

    int actualResult = PositiveAverageNumber.average(input1,input2);

    Assert.assertEquals("Error", expectedResult, actualResult );

}

}

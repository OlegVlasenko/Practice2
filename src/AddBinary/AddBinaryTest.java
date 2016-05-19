package AddBinary;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {
    private AddBinary AddBinary= new AddBinary();
    @Test
    public void AddBinaryTest_1(){
        String input1 = "101";
        String input2 = "100";

        String expectedResult = "1001";

        String actualResult = AddBinary.add(input1,input2);

        Assert.assertEquals("Error", expectedResult, actualResult);
    }
//    Input: "10000000000000000000000000000000", "10000000000000000000000000000000"
//    Expected: "100000000000000000000000000000000"

    @Test
    public void AddBinaryTest_2(){
        String input1 = "10000000000000000000000000000000";
        String input2 = "10000000000000000000000000000000";

        String expectedResult = "100000000000000000000000000000000";

        String actualResult = AddBinary.add(input1,input2);

        Assert.assertEquals("Error", expectedResult, actualResult);
    }
//2097172
   @Test
    public void AddBinaryTest_3(){
        String input1 = "10000000000000000000000000000000";
        String input2 = "10000000000000000000000000000000";

        String expectedResult = "100000000000000000000000000000000";

        String actualResult = AddBinary.add(input1,input2);

        Assert.assertEquals("Error", expectedResult, actualResult);
    }


}
package AbcNumber;

import org.junit.Assert;
import org.junit.Test;

public class AbcNumberTest {
    private final AbcNumber AbcNumber = new AbcNumber();

    @Test
    public void AbcNumberTest_1() {
        String input = "bcd";

        int expectedResult = 123;
        int actualResult = AbcNumber.convert(input);

        Assert.assertEquals("Error", expectedResult, actualResult);
    }
}

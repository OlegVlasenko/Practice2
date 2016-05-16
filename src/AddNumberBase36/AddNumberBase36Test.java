package AddNumberBase36;

import org.junit.Assert;
import org.junit.Test;

public class AddNumberBase36Test {
    private final AddNumberBase36 addNumberBase36 = new AddNumberBase36();
    @Test
    public void AddNumberBase36Test_1(){
        String input1 = "z";
        String input2 = "1";

        String expected = "10";

        String actualresult = addNumberBase36.add(input1,input2);

        Assert.assertEquals("Error",expected,actualresult);

    }

    @Test
    public void AddNumberBase36Test_2(){
        String input1 = "zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5";
        String input2 = "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N";

        String expected = "10g7vy7xrkildxnlpkvzwxy0uzwyyzx6kiwixx24xahmjyw2s";

        String actualresult = addNumberBase36.add(input1,input2);

        Assert.assertEquals("Error",expected,actualresult);

    }

    @Test
    public void AddNumberBase36Test32(){
        String input1 = "9";
        String input2 = "1";

        String expected = "a";

        String actualresult = addNumberBase36.add(input1,input2);

        Assert.assertEquals("Error",expected,actualresult);

    }

}

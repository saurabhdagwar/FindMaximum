import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givingNumbers_shouldReturnMax_FirstFirstPlace()  {
        FindMaximum findMaximum = new FindMaximum();
        int maximum = findMaximum.maximumNumber(20,10,15);
            Assert.assertEquals(20,maximum);
    }
    @Test
    public void givingNumbers_shouldReturnMax_SecondPlace()  {
        FindMaximum findMaximum = new FindMaximum();
        int maximum = findMaximum.maximumNumber(20,33,15);
        Assert.assertEquals(33,maximum);
    }
    @Test
    public void givingNumbers_shouldReturnMax_ThirdPlace()  {
        FindMaximum findMaximum = new FindMaximum();
        int maximum = findMaximum.maximumNumber(20,33,40);
        Assert.assertEquals(40,maximum);
    }
}

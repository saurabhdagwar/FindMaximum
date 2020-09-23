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

    @Test
    public void givingFlots_shouldReturnMaxAt_firstPlace() {
        FindMaximum findMaximum = new FindMaximum();
        Double maximum = findMaximum.maximumFloat(22.7,11.53,15.4);
        Assert.assertEquals((Double) 22.7,maximum);
    }
    @Test
    public void givingFlots_shouldReturnMaxAt_secondPlace() {
        FindMaximum findMaximum = new FindMaximum();
        Double maximum = findMaximum.maximumFloat(15.4,22.7,11.53);
        Assert.assertEquals((Double) 22.7,maximum);
    }
    @Test
    public void givingFlots_shouldReturnMaxAt_thirdPlace() {
        FindMaximum findMaximum = new FindMaximum();
        Double maximum = findMaximum.maximumFloat(11.53,15.4,22.7);
        Assert.assertEquals((Double) 22.7,maximum);
    }

    @Test
    public void givingString_shouldReturnMaxAt_firstPosition() {
        FindMaximum findMaximum  = new FindMaximum();
        String maximum = findMaximum.maximumString("Banana","Peach","Apple");
        Assert.assertEquals((String) "Banana",maximum);
    }
    @Test
    public void givingString_shouldReturnMaxAt_secondPosition() {
        FindMaximum findMaximum  = new FindMaximum();
        String maximum = findMaximum.maximumString("Apple","Banana","Peach");
        Assert.assertEquals((String) "Banana",maximum);
    }
    @Test
    public void givingString_shouldReturnMaxAt_thirdPosition() {
        FindMaximum findMaximum  = new FindMaximum();
        String maximum = findMaximum.maximumString("Apple","Peach","Banana");
        Assert.assertEquals((String) "Banana",maximum);
    }
}

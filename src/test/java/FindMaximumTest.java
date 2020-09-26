import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void givingNumbers_shouldReturnMax_FirstPlace() {
        Integer[] values = {100, 70, 30};
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Integer) 100, maximum);
    }

    @Test
    public void givingNumbers_shouldReturnMax_SecondPlace() {
        Integer[] values = {70, 100, 30};
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Integer) 100, maximum);
    }

    @Test
    public void givingNumbers_shouldReturnMax_ThirdPlace() {
        Integer[] values = {70, 40, 100};
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Integer) 100, maximum);
    }

    @Test
    public void givingDouble_shouldReturnMax_FirstPlace() {
        Double[] values = {117.6, 93.5, 67.3};
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 117.6, maximum);
    }

    @Test
    public void givingDouble_shouldReturnMax_SecondPlace() {
        Double[] values = {93.5, 117.6, 67.3};
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 117.6, maximum);
    }

    @Test
    public void givingDouble_shouldReturnMax_ThirdPlace() {
        Double[] values = {104.2, 93.5, 117.6};
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 117.6, maximum);
    }

    @Test
    public void givingString_shouldReturnMax_firstPlace() {
        String[] values = {"Peach", "Apple", "Banana"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givingString_shouldReturnMax_secondPlace() {
        String[] values = {"Apple", "Peach", "Banana"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givingString_shouldReturnMax_thirdPlace() {
        String[] values = {"Banana", "Apple", "Peach"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givingNumbers_shouldReturnMax() {
        Integer[] values = {100, 70, 30, 70 ,130};
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Integer) 130, maximum);
    }

    @Test
    public void givingFloat_shouldReturnMax(){
        Double[] values = {93.5, 117.6, 67.3, 133.9,88.4};
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 133.9, maximum);
    }

    @Test
    public void givingString_shouldReturnMax() {
        String[] values = {"Apple", "Peach", "Banana","Kivi","Strawberry"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Strawberry", maximum);
    }
}

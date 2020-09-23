import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class FindMaximumTest {
    @Test
    public void givingNumbers_shouldReturnMax_FirstPlace()  {
        Integer[] values = {100 , 70 , 30 };
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
            Assert.assertEquals((Integer) 100 , maximum);
    }
    @Test
    public void givingNumbers_shouldReturnMax_SecondPlace()  {
        Integer[] values = {70 , 100 , 30 };
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Integer) 100 , maximum);
    }
    @Test
    public void givingNumbers_shouldReturnMax_ThirdPlace()  {
        Integer[] values = {70 , 40 , 100 };
        Integer maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Integer) 100 , maximum);
    }
    @Test
    public void givingDouble_shouldReturnMax_FirstPlace()  {
        Double[] values = {117.6 , 93.5 , 67.3 };
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 117.6 , maximum);
    }
    @Test
    public void givingDouble_shouldReturnMax_SecondPlace()  {
        Double[] values = {93.5 , 117.6 , 67.3 };
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 117.6 , maximum);
    }
    @Test
    public void givingDouble_shouldReturnMax_ThirdPlace()  {
        Double[] values = { 104.2, 93.5 , 117.6 };
        Double maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals((Double) 117.6 , maximum);
    }
    @Test
    public void givingString_shouldReturnMax_firstPlace() {
        String values[] = {"Peach","Apple","Banana"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Peach", maximum  );
    }
    @Test
    public void givingString_shouldReturnMax_secondPlace() {
        String values[] = {"Apple","Peach","Banana"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Peach", maximum  );
    }
    @Test
    public void givingString_shouldReturnMax_thirdPlace() {
        String values[] = {"Banana","Apple","Peach"};
        String maximum = new FindMaximum<>(values).findMaximumValue();
        Assert.assertEquals("Peach", maximum  );
    }

    @Test
    public void givingNumbers_shouldReturnMax() {
        List<Integer> list = new LinkedList<>();
        list.add(38);
        list.add(63);
        list.add(29);
        list.add(79);
        list.add(51);
        list.add(69);
        Object max = new FindMaximum<>(list).printMax();
        Assert.assertEquals(79,max);
    }
    @Test
    public void givingDouble_shouldReturnMax() {
        List<Double> list = new LinkedList<>();
        list.add(26.8);
        list.add(43.7);
        list.add(83.3);
        list.add(52.8);
        list.add(49.1);
        list.add(69.5);
        Object max = new FindMaximum<>(list).printMax();
        Assert.assertEquals(83.3,max);
    }
    @Test
    public void givingString_shouldReturnMax() {
        List<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Orange");
        list.add("Kivi");
        list.add("Strawberrie");
        list.add("Peach");
        Object max = new FindMaximum<>(list).printMax();
        Assert.assertEquals("Strawberrie",max);
    }
}
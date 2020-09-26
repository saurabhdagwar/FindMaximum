import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindMaximum<E extends Comparable<E>> {
    E[] value;

    public FindMaximum(E[] value) {
        this.value = value;
    }

    public E findMaximumValue() {
        E[] maximumFind = value;
        if (value.length <= 3) {
            if (value[0].compareTo(value[1]) > 0 && value[0].compareTo(value[2]) > 0) {
                return value[0];
            } else if (value[1].compareTo(value[0]) > 0 && value[1].compareTo(value[2]) > 0) {
                return value[1];
            } else if (value[2].compareTo(value[0]) > 0 && value[2].compareTo(value[1]) > 0) {
                return value[2];
            }
        }
        else
            Arrays.sort(maximumFind,Collections.reverseOrder());
            return maximumFind[0];

    }
}

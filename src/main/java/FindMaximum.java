public class FindMaximum<E extends Comparable<E>> {
    E[] value;

    public FindMaximum(E[] value) {
        this.value = value;
    }


    public E findMaximumValue() {
        if (value[0].compareTo(value[1]) > 0 && value[0].compareTo(value[2]) > 0) {
            return value[0];
        }
         else if (value[1].compareTo(value[0]) > 0 && value[1].compareTo(value[2]) > 0) {
            return value[1];
        }
         else {
            return value[2];
        }
    }


}

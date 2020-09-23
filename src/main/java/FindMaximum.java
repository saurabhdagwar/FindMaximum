import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindMaximum<E extends Comparable<E>> {
    E[] value;
    List<E> listvaues = new LinkedList<>();

      public FindMaximum(E[] value) {
          this.value = value;
      }

      public FindMaximum(List<E> listvalues) {
        this.listvaues = listvalues;
    }
    public E findmax(){
        return Collections.max(listvaues);
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

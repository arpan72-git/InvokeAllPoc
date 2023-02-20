import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteeratorExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        Iterator<Integer> integerIterator = integers.iterator();
        while (integerIterator.hasNext()) {
            Integer in = integerIterator.next();
            if (in.equals(2)) {
                integerIterator.remove();
            }
        }

        System.out.println(integers);
    }

}

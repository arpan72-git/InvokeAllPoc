import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        for (Integer i : integers) {
            if (i.equals(2)) {
                integers.remove(i);
            }
        }

        System.out.println(integers);
    }

}

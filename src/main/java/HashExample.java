import java.util.HashMap;

public class HashExample {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(new Integer(1),1);
        map.put(new Integer(1), 1);

        System.out.println(map.size());
    }

}

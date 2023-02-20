import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KHJ {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("ABC", new ArrayList<>());
        map.getOrDefault("ABC", new ArrayList<>()).add("1");

        map.getOrDefault("ABC", new ArrayList<>()).add("2");
//        map.put("ABC", ss);

        System.out.println();
    }
}

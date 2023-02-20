import java.util.*;
import java.util.stream.Collectors;

public class YUA {
    public static void main(String[] args) {
        Map<String , List<String>> map = new HashMap<>();
        map.put("ABC", new ArrayList<>());
        map.getOrDefault("ABC", new ArrayList<>()).add("1");

        map.getOrDefault("ABC", new ArrayList<>()).add("2");

        map.put("EFG", new ArrayList<>());
        map.getOrDefault("EFG", new ArrayList<>()).add("3");

        map.getOrDefault("EFG", new ArrayList<>()).add("4");

        List<String> d = map.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println();
    }
}

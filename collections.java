import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, will be ignored

        System.out.println("Set Elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        System.out.println();

        // List Example
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List Elements:");
        for (int number : list) {
            System.out.println(number);
        }
        System.out.println();

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 22);

        System.out.println("Map Elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " years old");
        }
    }
}
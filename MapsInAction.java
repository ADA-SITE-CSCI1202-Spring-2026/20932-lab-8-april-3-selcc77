import java.util.*;

public class MapsInAction {
    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Selcan", 18);
        ages.put("Simara", 19);
        ages.put("Hasan", 17);
        ages.put("Nazrin", 20);
        ages.put("Abbas", 25);

        System.out.println("=== HashMap ===");

        System.out.println("\nEnhanced for loop:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nIterator:");
        Iterator<Map.Entry<String, Integer>> it = ages.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\ntoString():");
        System.out.println(ages);


        Map<String, Integer> linkedMap = new LinkedHashMap<>(ages);
        System.out.println("\n=== LinkedHashMap (insertion order) ===");
        System.out.println(linkedMap);

        Map<String, Integer> treeMap = new TreeMap<>(ages);
        System.out.println("\n=== TreeMap (sorted by keys ascending) ===");
        System.out.println(treeMap);

        Map<String, Integer> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());
        reverseTreeMap.putAll(ages);
        System.out.println("\n=== TreeMap (keys in descending order) ===");
        System.out.println(reverseTreeMap);

        System.out.println("\n=== HashMap sorted by values (descending) ===");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(ages.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

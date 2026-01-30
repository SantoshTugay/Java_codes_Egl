package interview_prgrams.collectionss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStrikeRateDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sachin", "Kohli", "Sachin", "Surya", "Kohli", "Sachin");
        Map<String, Integer> countMap = new HashMap<>();

        for (String name : names) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }
        // Display counts
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("----------------------- \n");
        Map<String, Double> map = new HashMap<>();
        map.put("Sachin", 9.2);
        map.put("Kholi", 9.0);
        map.put("Gill", 8.2);

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("Players with strike rate > 9.1:");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > 9.1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

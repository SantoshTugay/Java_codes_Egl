package interview_prgrams.collectionss;

import java.util.*;

public class FilterPassOnly {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "hello -PASS",
                "Fail-And PASS",
                "Im passed"
        );

        List<String> result = new ArrayList<>();

        for (String str : list) {
            String lower = str.toLowerCase();
            if (lower.contains("pass") && !lower.contains("fail")) {
                result.add(str);
            }
        }

        System.out.println(result);
    }
}
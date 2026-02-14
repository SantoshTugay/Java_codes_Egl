package interview_prgrams.Stringss;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.IntStream;

public class RemoveSpacesPrintEachCharacterIndex {

    public static void main(String[] args) {

        // 1️⃣ Using For Loop
        String str = "hi this sidd".replace(" ", "");
        for (int i = 0; i < str.length(); i++)
            System.out.println("Index " + i + " : " + str.charAt(i));
        System.out.println("---- Using Stream ----");

        // 2️⃣ Using Java 8 Stream
        String s1 = "hi this sidd".replace(" ", "");
        IntStream.range(0, s1.length())
                .forEach(i -> System.out.println(i + " : " + s1.charAt(i)));
        System.out.println("---- Using Map ----");

        // 3️⃣ Using LinkedHashMap
        String s2 = "hi this sidd".replace(" ", "");
        Map<Integer, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < s2.length(); i++)
            map.put(i, s2.charAt(i));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

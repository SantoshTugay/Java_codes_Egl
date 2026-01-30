package interview_prgrams.java.Java8_Samples;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapUsingJava8 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Java2");
		map.put(3, "Java3");
		map.put(4, "Java4");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}

		// java 8
		
		map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
	}

}

package interview_prgrams.java.Java8_Samples;

import java.util.ArrayList;
import java.util.List;

public class StreamExample1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Saay4");
		list.add("Sanjay3");
		list.add("Sany2");
		list.add("Sanjay1");

		// Traditional for-each loop
		int count = 0;
		for (String string : list) {
			if (string.length() < 6) {
				count++;
			}

		}
		System.out.println(count);

		// Using Stream API to filter elements based on length
		long count1 = list.stream().filter(str -> str.length() < 6).count();
		System.out.println(count1);
	}
}

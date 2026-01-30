package interview_prgrams.java.Java8_Samples;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("English");
		list.add("Maths");
		list.add("Computer lab");

		list.forEach((element) -> System.out.println(element));

	}
}

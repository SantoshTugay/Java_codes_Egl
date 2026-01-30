package interview_prgrams.java.Java8_Samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		// Example 1
		Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(4).forEach(System.out::println);
		// Example 2
		
		List<String> list1= Arrays.asList("A","Ab","Aa");
		List<String> list2= Arrays.asList("Apple","Asssb","Affffa");
		
		Stream<String> opstream=Stream.concat(list1.stream(), list2.stream());
		opstream.forEach(str->System.out.println(str+""));
		
	}
}

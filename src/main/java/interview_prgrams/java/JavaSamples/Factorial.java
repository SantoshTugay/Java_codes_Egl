package interview_prgrams.java.JavaSamples;

public class Factorial {

/*	public static long factorialIterative(in   t n) {
		if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}interview_prgrams.java.JavaSamples.PrintAllPrimeNumber
		return result;
	}*/
    	public static void main(String[] args) {
		int num=4;
		int fact=1;
		
//		for (int i = 1; i <=num; i++) {
//			fact=fact*i;
//		}
		
		int i=1;
		while (i<=num) {
			fact=fact*i;
			i++;
		}
		
		System.out.println(fact);
	}
}

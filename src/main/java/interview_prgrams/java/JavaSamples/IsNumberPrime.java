package interview_prgrams.java.JavaSamples;

public class IsNumberPrime {
	public static void main(String[] args) {

		int n = 13;
		boolean flag = false;

		for (int i = 2; i < n / 2; ++i) {
			if (n % 2 == 0) {
				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not a Prime No");
		}
	}

}

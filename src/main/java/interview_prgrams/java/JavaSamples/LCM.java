package interview_prgrams.java.JavaSamples;

public class LCM {
	public static void main(String[] args) {
		int a = 3;
		int b = 11;

		int ans = (a > b) ? a : b;
		while (true) {
			if (ans % a == 0 && ans % b == 0)
				break;
			ans++;

		}
		System.out.println("LCM of " + a + " and " + b + " : " + ans);
	}
}

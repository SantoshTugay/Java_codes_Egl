package interview_prgrams.Stringss;

public class substring {
	public static void main(String[] args) {
		String n = "abcaa";
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			for (int j = i + 1; j <= n.length(); j++) {
				System.out.println(n.substring(i, j));
				count++;
			}
		}
		System.out.println("Total pairs = " + count);
	}
}

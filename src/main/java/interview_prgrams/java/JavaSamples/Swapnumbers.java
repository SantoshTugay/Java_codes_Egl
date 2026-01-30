package interview_prgrams.java.JavaSamples;

public class Swapnumbers {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;

		z = x;
		x = y;
		y = z;

		System.out.println("X : " + x + " Y : " + y);
		
		//==========swap with third variable=====================//
		
		
		 x = x + y;
		 y = x - y;
		 x = x - y;
		
		System.out.println("X : " + x + " Y : " + y);

	}
}

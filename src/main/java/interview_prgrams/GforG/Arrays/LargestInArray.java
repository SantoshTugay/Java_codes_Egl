package interview_prgrams.GforG.Arrays;

public class LargestInArray {
	public static void main(String args[] ) {
		int arr[]= {-1,-2,-2,-3,-5};
		int largest=arr[0];

		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		System.out.println(largest);

		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest found.");
		} else {
			System.out.println("Second Largest: " + secondLargest);
		}
	}
}

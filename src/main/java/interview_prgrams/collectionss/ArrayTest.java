package interview_prgrams.collectionss;

public class ArrayTest {
    public static void main(String args[]){
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[0]);
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] arr =new int[3];
        arr[0]=1;
        arr[1]=11;
        arr[2]=numbers[0];
        for(int arr1:arr) {
            System.out.println(arr1);
        }
    }
}

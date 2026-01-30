package interview_prgrams.GforG.Arrays;

public class MaxConsecutiveBitsInArray {
    public static void main(String[] args) {
        int arr[]={0,0,1,0,1};
        if(arr.length==0){
            System.out.println("arr size is 0");
        }
        int maxCount=0;
        int count=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                count++;
            }
            else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        System.out.println(Math.max(maxCount, count));
        }
    }
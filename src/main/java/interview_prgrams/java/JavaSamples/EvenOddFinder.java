package interview_prgrams.java.JavaSamples;

import java.util.ArrayList;

public class EvenOddFinder {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for(int i:arr){
            if(i%2==0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        System.out.println("Even :"+ even +" \nOdd :"+odd);

    }
}

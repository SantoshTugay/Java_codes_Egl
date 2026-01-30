package interview_prgrams.GforG;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter No : ");
            n=scanner.nextInt();
        }
        System.out.println("Enter No : " +n);
        if(n%2==0){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" is odd");
        }
    }
}

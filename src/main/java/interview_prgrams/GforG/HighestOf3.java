package interview_prgrams.GforG;

import java.util.Scanner;

public class HighestOf3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter 3 no :");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            System.out.println("No ares :"+a+" "+b+" "+c);
            if(a>=b&&a>=c){
                System.out.println(a+ "a is higesht");
            } else if (b>=a&&b>=c) {
                System.out.println(b+ "b is higesht");
            }else {
                System.out.println(c+ "c is higesht");
            }

            int max = Math.max(a, Math.max(b, c));
            System.out.println("Highest number: " + max);
        }


    }
}

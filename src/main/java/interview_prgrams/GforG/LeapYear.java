package interview_prgrams.GforG;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        /*
        A century year is a year ending with 00. A century year is a leap year only if
         it is divisible by 400.
        A leap year (except a century year) can be identified if it is exactly divisible by 4.
        A century year should be divisible by 4 and 100 both.
        A non-century year should be divisible only by 4.
          */
        System.out.println("Enter the year : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int year = scanner.nextInt();
            System.out.println("year : " + year);
            boolean is_leap_year = false;

            if (year % 400 == 0) {
                is_leap_year = true;
            } else if (year % 100 == 0) {
                is_leap_year = false;
            } else if (year % 4 == 0) {
                is_leap_year = true;
            } else {
                is_leap_year = false;
            }

            if (is_leap_year) {
                System.out.println(year + " : Leap Year");
            } else {
                System.out.println(year + " : Non Leap-Year");
            }

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                // Both conditions true- Print leap year
                System.out.println(year + " : Leap Year");
            } else {
                // Any condition fails- Print Non-leap year
                System.out.println(year + " : Non - Leap Year");
            }
        }
    }
}

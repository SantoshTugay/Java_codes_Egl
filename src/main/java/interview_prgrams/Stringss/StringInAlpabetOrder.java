package interview_prgrams.Stringss;

import java.util.Arrays;

public class StringInAlpabetOrder {
    public static void main(String[] args) {

        String str = "abdcecc";
        char[] ch1 = str.toCharArray();
        Arrays.sort(ch1);
        String sortedUsingInbuilt = new String(ch1);

        System.out.println("Original String : " + str);
        System.out.println("Sorted String   : " + sortedUsingInbuilt);

        char[] ch2 = str.toCharArray();
        for (int i = 0; i < ch2.length - 1; i++) {
            for (int j = 0; j < ch2.length - i - 1; j++) {
                if (ch2[j] > ch2[j + 1]) {
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;
                }
            }
        }
        System.out.println(ch2);
    }
}
package interview_prgrams.Stringss;

import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        String s = "this is epam systems";
        String reverseString = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
             ch = s.charAt(i);
             reverseString = ch + reverseString;
        }
        System.out.println("Reversed string: " + reverseString);

        for(int i=s.length()-1;i>0;i--){
            reverseString=reverseString+s.charAt(i);

        }
        System.out.println("Reversed string: " + reverseString);

        String result = new StringBuilder("Santosh").reverse().toString();

        System.out.println("Reversed string: " + result);

        String reversed = Stream.of(s.split(""))
                .reduce("", (reversedString, character) -> character + reversedString);

        System.out.println("Reversed: " + reversed);

    }
}
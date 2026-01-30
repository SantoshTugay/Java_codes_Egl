package interview_prgrams.Stringss;

import java.util.Arrays;

public class StringInAlpabetOrder {
    public static void main(String[] args) {
        String str="abdcecc";
        char[] ch=str.toCharArray();

        Arrays.sort(ch);

        String res=new String(ch);
        System.out.println(str+"\n"+res);
    }
}

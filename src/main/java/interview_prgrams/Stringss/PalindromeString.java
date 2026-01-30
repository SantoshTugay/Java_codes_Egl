package interview_prgrams.Stringss;

public class PalindromeString {

   public static void main(String[] args) {
        String s1="dads";
        String rev="";
        for(int i=0;i<s1.length();i++){
            rev=rev+s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println("String is a palindrome");
        }else {
            System.out.println("String is Not a palindrome");
        }

    }
}
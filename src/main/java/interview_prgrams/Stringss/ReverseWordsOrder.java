package interview_prgrams.Stringss;

public class ReverseWordsOrder {
    public static void main(String[] args) {
    
        System.out.println("--- LOGIC 2: Reversing Word Order ---");
        String str = "This is oops Selenium";
        String arr[] = str.split(" ");
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + arr[i] + " ";
        }
        System.out.println(str);
        System.out.println(rev.trim());

    }
}
package interview_prgrams.Stringss.reversee;

public class ReverseWordsOrder {
    public static void main(String[] args) {

        String str = "This is oops Selenium"; // Selenium oops is This
        String arr[] = str.split(" ");
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + arr[i] + " ";
        }
        System.out.println(str);
        System.out.println(rev.trim());

    }
}
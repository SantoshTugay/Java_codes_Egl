package interview_prgrams.Stringss.reversee;

public class ReverseWordsCapitalize {
    public static void main(String[] args) {
        String input = "This is Epam Systems"; //Siht Si Mape Smetsys

        String[] words2 = input.split(" ");
        String result2 = "";
        for (int i = 0; i < words2.length; i++) {
            String word = words2[i];
            String revWord = "";
            // Forward loop with pre-pended characters to reverse the word
            for (int j = 0; j < word.length(); j++) {
                revWord = word.charAt(j) + revWord;
            }
            // Capitalize first letter of the reversed word
            String formatted = revWord.substring(0, 1).toUpperCase() + revWord.substring(1).toLowerCase();
            result2 = result2 + formatted + " ";
        }
        System.out.println("Input:  " + input);
        System.out.println("Result: " + result2.trim());
    }
}
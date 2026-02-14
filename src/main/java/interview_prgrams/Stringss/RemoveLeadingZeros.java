package interview_prgrams.Stringss;

public class RemoveLeadingZeros {

    public static void main(String[] args) {

        String input = "   012030";
        input = input.trim();
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0') {
                index = i;
                break;
            }
            index = i + 1;
        }
        String result = (index == input.length()) ? "0" : input.substring(index);
        System.out.println(result);
    }
}

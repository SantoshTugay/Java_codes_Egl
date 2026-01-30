package interview_prgrams.Stringss;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String input = "   012030";
        if (input != null) {
            input = input.trim();
        }
        if (input == null || input.isEmpty()) {
            System.out.println("enter the correct data");
        }

        int index = 0;
        // Remove zeros only until the first non-zero character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0') {
                index = i;
                break;
            }
        }

        String output = input.substring(index);
        // Case: "0000" -> return "0"
        System.out.println(output.isEmpty() ? "0" : output);
    }
}
package interview_prgrams.Stringss;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String original = "  Hello, World! Java is awesome.  ";
        String another = "hello, world! java is awesome.";

        // codepointAt Returns the character (Unicode code point) at the specified index
        int val=another.codePointAt(1);
        System.out.println(another.charAt(1)+""+val);

        // 1. length()
        System.out.println("Length: " + original.length());

        // 2. charAt()
        System.out.println("Char at 7: " + original.charAt(7));

        // 3. substring()
        System.out.println("Substring (7,12): " + original.substring(7, 12));

        // 4. indexOf() and lastIndexOf()
        System.out.println("Index of 'Java': " + original.indexOf("Java"));
        System.out.println("Last index of 'a': " + original.lastIndexOf('a'));

        // 5. contains()
        System.out.println("Contains 'World': " + original.contains("World"));

        // 6. startsWith() and endsWith()
        System.out.println("Starts with '  Hello': " + original.startsWith("  Hello"));
        System.out.println("Ends with 'awesome.  ': " + original.endsWith("awesome.  "));

        // 7. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());

        // 8. trim()
        System.out.println("Trimmed: '" + original.trim() + "'");

        // 9. replace() and replaceAll()
        System.out.println("Replace 'Java' with 'Python': " + original.replace("Java", "Python"));
        System.out.println("ReplaceAll vowels with *: " + original.replaceAll("[AEIOUaeiou]", "*"));

        // 10. split()
        String[] words = original.trim().split(" ");
        System.out.print("Split words: ");
        for (String word : words) {
            System.out.print(word + " | ");
        }
        System.out.println();

        // 11. equals() and equalsIgnoreCase()
        System.out.println("Equals another: " + original.trim().equals(another.trim()));
        System.out.println("EqualsIgnoreCase another: " + original.trim().equalsIgnoreCase(another.trim()));

        // 12. valueOf()
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("String value of number: " + numberStr);

        // 13. concat()
        System.out.println("Concat: " + original.trim().concat(" Let's learn!"));

        // 14. format()
        String formatted = String.format("Welcome, %s! You have %d new messages.", "Alice", 5);
        System.out.println("Formatted string: " + formatted);

        // 15. compareTo()
        System.out.println("CompareTo another: " + original.trim().compareTo(another.trim()));

        // 16. StringBuilder (mutable strings)
        StringBuilder sb = new StringBuilder(original.trim());
        sb.append(" Let's code!");
        System.out.println("StringBuilder result: " + sb.toString());

        // 17. isEmpty() and isBlank() (since Java 11)
        System.out.println("Is original empty: " + original.isEmpty());
        // isBlank() is available from Java 11 onwards
        // System.out.println("Is original blank: " + original.isBlank()); // Uncomment if using Java 11+

        // 18. toCharArray()
        char[] chars = original.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

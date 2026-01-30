package interview_prgrams.Stringss;

import java.util.HashMap;

public class DuplicateCharsFromString {
    public static void main(String[] args) {
        String str = "engineering";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == '0') continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " : " + count);
            }
        }

        System.out.println("Another Way..");
        HashMap<Character,Integer> charCount=new HashMap<>();
        for(char ch: str.toCharArray()){
            if(charCount.containsKey(ch))
            {
                charCount.put(ch,charCount.get(ch)+1);
            }else {
                charCount.put(ch,1);
            }
        }
        System.out.println(charCount);

    }
}


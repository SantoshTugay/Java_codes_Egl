package interview_prgrams.GforG;

import java.util.stream.Stream;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swss";

        Stream.of(s.split(""))
                .filter(str -> s.indexOf(str) == s.lastIndexOf(str))
                .forEach(System.out::print);

        for (int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(s.indexOf(c1)!=s.lastIndexOf(c1)){
                System.out.println(c1);
            }
        }
    }
}
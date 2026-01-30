package interview_prgrams.Stringss;

public class printWordsOfEvenLength {
    public static void main(String args[]){
        String s="this is a java program";

        for(String s1:s.split(" ")){
            if(s1.length()%2==0){
                System.out.println(s1);
            }
        }

    }
}

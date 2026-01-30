package interview_prgrams.collectionss;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String args[]){
        List<String> l=new ArrayList<>();
        l.add("Sid");
        l.add("Rocky");
        l.add("Sam");

       
        for(String s:l){
            System.out.println(s);
        }
    }
}

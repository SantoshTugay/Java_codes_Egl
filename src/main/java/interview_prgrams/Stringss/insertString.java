package interview_prgrams.Stringss;

public class insertString {
    public static void main(String[] args) {
        String s="Hello world";
        String s2="ABC";
        int position=8;
        String res=s.substring(0,8)+" ABC "+s.substring(8);
        System.out.println(res);

        String  newString=new String();
        for(int i=0;i<s.length();i++){
            newString+=s.charAt(i);
            if(i==position)
                newString+=s2;
        }
        System.out.println(newString);
    }
}

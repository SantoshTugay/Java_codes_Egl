package interview_prgrams.java.JavaSamples;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 4560001;
        int reversedNum = 0;
        while(num>0){
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
            num=num/10;
        }
        System.out.println(num+"Reversed number: " + reversedNum);
    }
}
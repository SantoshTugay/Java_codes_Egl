package interview_prgrams.GforG;

public class LCM {
    public static void main(String[] args) {
        int a=15,b=25;
        int largest=(a>b)?a:b;
        while(true){
            if(largest%a==0&&largest%b==0){
                break;
            }
            largest++;
        }
        System.out.println("LCM of"+a+" and "+b+" is :"+largest);
    }
}

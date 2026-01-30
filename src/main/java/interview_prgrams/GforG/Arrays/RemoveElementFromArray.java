package interview_prgrams.GforG.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};

        int deletNo=5;

        for(int i=0;i<arr.length;i++){
            if(deletNo==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);;
        }
    }
}

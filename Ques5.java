import java.util.ArrayList;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<>();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i=0;i<n;i++){
            if(arr[i]>=0){
                a1.add(arr[i]);
                count++;
            }
        }
        if (count==0){
            System.out.println("NA");
        }
        else {
            System.out.println(a1);
        }
    }
}

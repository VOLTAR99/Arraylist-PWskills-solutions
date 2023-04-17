import java.util.ArrayList;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("Enter both the indexes for swap:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        Integer temp=Integer.valueOf(l1.get(a));
        l1.set(a,l1.get(b));
        l1.set(b,temp);
        System.out.println(l1);
    }
}

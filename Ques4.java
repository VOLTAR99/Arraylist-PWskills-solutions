import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        Collections.sort(l1);
        System.out.println(l1);
    }
}

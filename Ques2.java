import java.util.ArrayList;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        l1.remove(2);
        System.out.println(l1);
    }
}

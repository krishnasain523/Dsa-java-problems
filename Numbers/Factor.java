package Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Find all factors of a Natural Number in sorted order
//   day 2
public class Factor {
    public static void checkfactor(int n) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) {
                    large.add(n / i);
                }
            }

        }
        for (int i = 0; i < small.size(); i++) {
            System.out.print(small.get(i) + " ");
        }
        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkfactor(n);

    }
}

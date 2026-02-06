
// Permutations to arrange N persons around a circular table
package Numbers;

import java.util.Scanner;

public class arrangenum {
    public static int fact(int x)
    {
        if(x==1||x==0)
        {
            return 1;
        }
        return x*fact(x-1);
    }
    public static void main(String[] args) {
            System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("total numbers of arrange "+n+" "+"persons is"+" "+fact(n-1));
    }
}

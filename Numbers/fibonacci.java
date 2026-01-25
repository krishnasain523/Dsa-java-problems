package Numbers;

import java.util.Scanner;

public class fibonacci {

    public static int series(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
        return 1;
        }
        return series(n-1)+series(n-2);

    }
public static void main(String[] args) {
           System.out.println("enter tern");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print(series(i)+" ");
        }
   
}
}


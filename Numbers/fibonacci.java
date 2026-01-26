// problem nth fibonacci number
// plateform geeks for geeks


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
           System.out.println("enter pos");
        Scanner sc= new Scanner(System.in);
        int n=6;
        int pos=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
         arr[i]=series(i);
        }
        System.out.println(arr[pos-1]+" "+"is the "+pos+"th"+" "+"num of fibonacci series" );
   
}
}


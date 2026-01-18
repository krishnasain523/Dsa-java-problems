// problem climbing stairs
// plateform- leetcode
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

package Numbers;
import java.util.*;
public class climbingstairs {
    public static int climbways(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int ways=climbways(4);
        System.out.println("the total ways of climb stairs is"+" "+ways);
    }
}

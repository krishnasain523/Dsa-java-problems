package Numbers;

import java.util.Scanner;

public class perfectsquare {


    public static boolean isperfectsqare(int num)
    {
  long low=1;
        long high=num;
       
        while(low<=high)
        {  long mid=low+(high-low)/2;
            if(mid*mid==num)
        {
            return true;
        }
        else if(mid*mid>num)
        {
           high=mid-1;
        }
        else
        {
            low=mid+1;
        }
        }
        return false;
    }
    public static void main(String[] args) {
       System.out.println("enter num");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(isperfectsqare(num))
        {
            System.out.println("this is perfect square");
        }
        else
        { System.out.println("this is not perfect square");

        }
      
    }
}

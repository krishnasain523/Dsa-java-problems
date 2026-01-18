package Numbers;

import java.util.Scanner;

public class leapyear {
 
    public static boolean isleapyear(int n)
    {
         if((n%4==0 && n%100!=0)||(n%400==0))
         {
            return true;
         }
         else
         {
            return false;
         }
    }
    public static void main(String[] args) {
        System.out.println("enter number to check is that is leap year or not" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isleapyear(n))
        {
            System.out.println("This year is leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }

}

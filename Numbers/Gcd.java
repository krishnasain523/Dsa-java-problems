package Numbers;
import java.util.Scanner;
public class Gcd {
    public static int hcf(int a,int b)
    {
        a=Math.abs(a);
        b=Math.abs(b);
       while(b!=0)
       {
        int rem=a%b;
        a=b;
        b=rem;
       }
       return a; 
    }
    public static void main(String[] args) {
         System.out.println("enter 2 number");
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
      int  gcd=hcf(n1,n2);
       System.out.println("the gcd of"+"("+n1+","+n2+")"+" "+"is "+gcd);
    }
}

package Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tohexadimal {
    public static void main(String[] args) {
         System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
        List<Character> rem=new ArrayList<>();
         while (n>0) {
            int r=n%16;
            if(r<10)
            {
                rem.add((char)(r+'0'));
            }
            else{
                rem.add((char)(r-10+'A'));
            }
           n=n/16;
         }
         for(int j=rem.size()-1; j>=0; j--)
         {
          System.out.print(rem.get(j));
         }
    }

}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascel {

    public static List<List<Integer>> genrate(int numrows)
    {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0; i<numrows; i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0; j<=i; j++)
            {
                if(j==0||i==j)
                {
                    row.add(1);
                }
                else
                {
                    int val =triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                    row.add(val);
                }

            }
            triangle.add(row);
        }
        return triangle;
        
    }
    public static void main(String[] args) {
          System.out.println("enter num");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(genrate(n));

    }
}

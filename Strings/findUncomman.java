import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findUncomman {
    
    public static String[] uncommonFromSentences(String s1, String s2) {
        
        String[] arr1=s1.split(" ");
        String[]  arr2=s2.split(" ");
               List <String> l1=new ArrayList<>();
               for(int i=0; i<arr1.length; i++)
               {    int count=0;
                      for(int j=0; j<arr1.length; j++)
                        {
                           if(arr1[i].equals(arr1[j]))
                           {
                            count++;
                           }
                         }

                         for(int j=0; j<arr2.length; j++)
                         {
                          if(arr1[i].equals(arr2[j]))
                           {
                            count++;
                           }
                         }
                         if(count==1)
                         {
                           l1.add(arr1[i]);
                         }
               }
                 for(int i=0; i<arr2.length; i++)
               {    int count=0;
                      for(int j=0; j<arr2.length; j++)
                        {
                           if(arr2[i].equals(arr2[j]))
                           {
                            count++;
                           }
                         }

                         for(int j=0; j<arr1.length; j++)
                         {
                          if(arr2[i].equals(arr1[j]))
                           {
                            count++;
                           }
                         }
                         if(count==1)
                         {
                           l1.add(arr2[i]);
                         }
               }   
        return l1.toArray(new String[0]);
          


    }

    public static void main(String[] args) {
        System.out.println("enter String 1");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
         System.out.println("enter String 2");
          String str2=sc.nextLine();
         String[] arr= uncommonFromSentences(str1,str2);
          for(int i=0; i<arr.length; i++)
          {
            System.out.print("the uncommoan words is"+arr[i]);
          }

    }

}

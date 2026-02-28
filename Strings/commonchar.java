import java.util.ArrayList;
import java.util.List;

public class commonchar {
  public static void fillcount(String word,int count[])
  {
     for(int ch=0; ch<word.length(); ch++)
     {   char c=word.charAt(ch);
        count[c-'a']++;
     }
  }

    public static void main(String[] args) {
      List<String> list=new ArrayList<>();
        String words[]={"bellla","label","roller"};
         int count[]=new int[26];
         fillcount(words[0], count);
         for(int i=1; i<words.length; i++)
         {
            int tempcount[]=new int[26];
            fillcount(words[i], tempcount);
            for(int j=0; j<count.length; j++)
            { 
                count[j]=Math.min(count[j], tempcount[j]);
            }

         }
         for(int i=0; i<count.length; i++)
         {
            while(count[i]>0)
            {  
                list.add(String.valueOf((char)(i+'a')));
                count[i]--;
            }
         }

    }
}

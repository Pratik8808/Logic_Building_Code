//Input: india is my country i live in india
//Output :bharat is my country i live in bharat
import java.util.*;
class Program750
{

    public static void main(String[] A) 
    {   
        int i=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the String");
        String str=sobj.nextLine();

        str=str.trim();
        str=str.replaceAll("\\s+"," ");
        str=str.toLowerCase();

        char Arr[]=str.toCharArray();

        int Freqency[]=new int[26];

        
        //A b   c d
        //97 98 99 100
        for( i=0;i<Arr.length;i++)
        {
            if(Arr[i]>='a' && Arr[i]<= 'z')
            {
                Freqency[(int)Arr[i]-97]++;
            }
        }

       System.out.println("Frequency of each letter is :");
       for( i=0;i<Freqency.length;i++)
       {
            System.out.println((char)(i+97)+":"+Freqency[i]);
       }
    }
}
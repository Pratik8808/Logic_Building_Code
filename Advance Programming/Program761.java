//Input: india is my country i live in india
//Output :bharat is my country i live in bharat
import java.util.*;
class Program759
{

    public static  boolean CheckAnagram(String str1 ,String str2)
    {
        

        int i=0;

        if(str1.length() != str2.length())
        {
            return false;
        }
        boolean bflag=true;
        str1=str1.trim();
        str1=str1.replaceAll("\\s+"," ");
        str1=str1.toLowerCase();
        char Arr[]=str1.toCharArray();
       

        str2=str2.trim();
        str2=str2.replaceAll("\\s+"," ");
        str2=str2.toLowerCase();
        char Brr[]=str2.toCharArray();


        int Freqency[]=new int[26];

        
   
        for( i=0;i<Arr.length;i++)
        {
            if(Arr[i]>='a' && Arr[i]<= 'z')
            {
                Freqency[(int)Arr[i]-97]++;
            }
            
            if(Brr[i]>='a' && Brr[i]<= 'z')
            {
                Freqency[(int)Brr[i]-97]--;
            }
        }

       

        for(i=0;i<Freqency.length;i++)
        {
            if(Freqency[i]!=0)
            {
                bflag=false;
                break;
            }
        }


        return bflag;
 

    }
    public static void main(String[] A) 
    {   
        int i=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter First  String");
        String str1=sobj.nextLine();


        System.out.println("Enter Second String");
        String str2=sobj.nextLine();

        boolean bRet=CheckAnagram(str1, str2);

        if(bRet==true)
        {
            System.out.println("Is vaild anagram ");
            
        }
        else
        {
            System.out.println("String are not Anagram");
        }


     
    }
}
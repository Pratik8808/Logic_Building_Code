//Input: india is my country i live in india
//Output :bharat is my country i live in bharat
import java.util.*;
class Program750
{

    public static  boolean CheckAnagram(String str1 ,String str2)
    {
    // {
    //     int arr1[]=new int[26];
    //     int arr2[]=new int[26];
    //     for(int i=0;i<str1.length();i++)
    //     {
    //         if(arr[])
    //     }
    return true;

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

        if(bRet)
        {
            System.out.println("Is vaild anagram ");
            
        }
        else
        {
            System.out.println("String are not Anagram");
        }


     
    }
}